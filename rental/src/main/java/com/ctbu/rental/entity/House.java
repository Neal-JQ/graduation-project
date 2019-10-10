package com.ctbu.rental.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "HOUSE")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "AREA")
    private int area;

    @Column(name = "ROOM")
    private int room;

    @Column(name = "PARLOUR")
    private int parlour;

    @Column(name = "BATHROOM")
    private int bathroom;

    @Column(name = "FLOOR")
    private int floor;

    @Column(name = "BUILD_YEAR")
    private int buildYear;

    @Column(name = "STATUS")
    private int status;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "REGION_NAME")
    private String regionName;

    @Column(name = "STREET")
    private String street;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "HOUSE_ID")
    private List<HouseTag> houseTags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getParlour() {
        return parlour;
    }

    public void setParlour(int parlour) {
        this.parlour = parlour;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<HouseTag> getHouseTags() {
        return houseTags;
    }

    public void setHouseTags(List<HouseTag> houseTags) {
        this.houseTags = houseTags;
    }
}
