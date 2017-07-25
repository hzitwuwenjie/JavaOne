package com.jc02.xiewenqiang.message;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:51
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationEventMessage extends EventMessage {
    private String latitude;//	地理位置纬度
    private String longitude;//	地理位置经度
    private String precision;//	地理位置精度

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
