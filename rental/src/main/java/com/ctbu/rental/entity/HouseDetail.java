package com.ctbu.rental.entity;

import javax.persistence.*;

@Entity
@Table(name = "HOUSE_DETAIL")
public class HouseDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TRAFFIC_DESC")
    private String trafficDesc;

    @Column(name = "ROUND_SERVICE")
    private String roundService;

    @Column(name = "RENT_WAY")
    private int rentWay;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "HOUSE_ID")
    private Long houseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrafficDesc() {
        return trafficDesc;
    }

    public void setTrafficDesc(String trafficDesc) {
        this.trafficDesc = trafficDesc;
    }

    public String getRoundService() {
        return roundService;
    }

    public void setRoundService(String roundService) {
        this.roundService = roundService;
    }

    public int getRentWay() {
        return rentWay;
    }

    public void setRentWay(int rentWay) {
        this.rentWay = rentWay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }
}
