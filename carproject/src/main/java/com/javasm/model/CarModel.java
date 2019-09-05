package com.javasm.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.javasm.utils.JsonDateUtil;

import java.util.Date;

public class CarModel {

    private String id;
    private String carCode;
    private String carUser;

    @JsonSerialize(using = JsonDateUtil.class)
    private Date carTime;

    private String carType;
    private String carAddress;
    private Integer carStatus;
    private String carPhone;


    @Override
    public String toString() {
        return "CarModel{" +
                "id='" + id + '\'' +
                ", carCode='" + carCode + '\'' +
                ", carUser='" + carUser + '\'' +
                ", carTime=" + carTime +
                ", carType='" + carType + '\'' +
                ", carAddress='" + carAddress + '\'' +
                ", carStatus=" + carStatus +
                ", carPhone='" + carPhone + '\'' +
                '}';
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone;
    }

    public CarModel() {
    }



    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getCarUser() {
        return carUser;
    }

    public void setCarUser(String carUser) {
        this.carUser = carUser;
    }

    public Date getCarTime() {
        return carTime;
    }

    public void setCarTime(Date carTime) {
        this.carTime = carTime;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarAddress() {
        return carAddress;
    }

    public void setCarAddress(String carAddress) {
        this.carAddress = carAddress;
    }
}
