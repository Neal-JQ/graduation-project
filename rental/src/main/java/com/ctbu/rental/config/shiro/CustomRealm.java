package com.ctbu.rental.config.shiro;

import com.ctbu.rental.entity.User;
import com.ctbu.rental.repository.UserRepository;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserRepository userRepository;

    public CustomRealm() {
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("user:show");
        stringSet.add("user:admin");
        info.setStringPermissions(stringSet);
        return info;
    }

    /**
     * 这里可以注入userService,为了方便演示，我就写死了帐号了密码
     * private UserService userService;
     * <p>
     * 获取即将需要认证的信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) {
//        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        System.out.println("-------身份认证方法--------");
        String userName = (String) authenticationToken.getPrincipal();
        //根据用户名从数据库获取密码
        User user = userRepository.findByNameOrEmailOrPhoneNumber(userName, userName, userName);
        //盐值
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getName());
        return new SimpleAuthenticationInfo(userName, user.getPassword(), credentialsSalt, getName());
    }

    public static void main(String[] args) {
        String hashAlgorithName = "MD5";
        String password = "20192019";
        int hashIterations = 2;//加密次数
        ByteSource credentialsSalt = ByteSource.Util.bytes("toughchow@gmail.com");
        Object obj = new SimpleHash(hashAlgorithName, password, credentialsSalt, hashIterations);
        System.out.println(obj);
    }
}
