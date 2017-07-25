package com.jc02.zengjing.message.eventmessage;

import com.jc02.zengjing.message.EventMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:54
 * |  @description上传位置事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocalMessage extends EventMessage {
    private String latitude;
    private String longitude;
    private String precision;

    public LocalMessage() {
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
    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("<Latitude><![CDATA["+getLatitude()+"]]></Latitude>");
        System.out.println("<Longitude><![CDATA["+getLongitude()+"]]></Longitude>");
        System.out.println("<Precision><![CDATA["+getPrecision()+"]]></Precision>");
        System.out.println("</xml>");
    }
}