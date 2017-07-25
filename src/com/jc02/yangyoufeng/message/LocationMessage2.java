package com.jc02.yangyoufeng.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月24日 - 17:06
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage2 extends EventMessage{
    private String latitude;//地理位置纬度
    private String longitude;//	地理位置经度
    private String precision;//	地理位置精度

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