package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:36　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class LocaEventMessage extends EventMessage {
    private String latitude;//	地理位置纬度
    private String longitude;//	地理位置经度
    private String precision;//	地理位置精度
    public LocaEventMessage(){
        super("location");
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        longitude = longitude;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        precision = precision;
    }
}

