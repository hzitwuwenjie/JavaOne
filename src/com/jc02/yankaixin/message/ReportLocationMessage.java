package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:44
 * |  @description   上报地理位置事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ReportLocationMessage extends EventMessage{

    private double latitude;
    private double longitude;
    private double precision;

    public ReportLocationMessage(double latitude, double longitude, double precision) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.precision = precision;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }
}
