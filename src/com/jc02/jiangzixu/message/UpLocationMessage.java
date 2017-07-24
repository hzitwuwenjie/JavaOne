package com.jc02.jiangzixu.message;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class UpLocationMessage extends EventsMessage {
    private String Latitude;

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String precision) {
        Precision = precision;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    private String Longitude;
    private String Precision;
}
