package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class LocaEventMessage extends EventMessage{
    private String latitude;	//地理位置纬度
    private String longitude;	//地理位置经度
    private String precision;	//地理位置精度

    public LocaEventMessage() {
        super("LOCATION");
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }
}
