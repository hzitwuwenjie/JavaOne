package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 17:00　                    
 *  |    @description   上报地理位置事件　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class ReportDiLiShiJian extends ShiJian{
    private String latitude;//地理位置纬度
    private String longitude;//地理位置经度
    private String precisionl;//地理位置精度

    public ReportDiLiShiJian() {
        super("location");
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

    public String getPrecisionl() {
        return precisionl;
    }

    public void setPrecisionl(String precisionl) {
        this.precisionl = precisionl;
    }
}
