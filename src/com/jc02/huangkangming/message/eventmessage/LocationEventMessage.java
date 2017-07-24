package com.jc02.huangkangming.message.eventmessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:53
 * |  @description 上报地理位置事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationEventMessage extends EventMessage {
    private String latitude;
    private String longitude;
    private String precision;

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