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
    private String precision;//地理位置精度

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

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<Latitude><![CDATA["+getLatitude()+"]]></Latitude>");
        System.out.println("\t<Longitude><![CDATA["+getLongitude()+"]]></Longitude>");
        System.out.println("\t<Precision><![CDATA["+getPrecision()+"]]></Precision>");
        System.out.println("</xml>");
    }
}
