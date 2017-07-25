package com.jc02.xiewenqiang.message.eventmessage;

import com.jc02.xiewenqiang.message.EventMessage;

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

    public LocationEventMessage() {
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

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA[toUser]]>"+getToUserName()+"</ToUserName>");
        System.out.println("\t<FromUserName><![CDATA[fromUser]]>"+getFromUserName()+"</FromUserName>");
        System.out.println("\t<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA[event]]>"+getMsgType()+"</MsgType>");
        System.out.println("\t<Event><![CDATA[LOCATION]]>"+getEvent()+"</Event>");
        System.out.println("\t<Latitude>"+getLatitude()+"</Latitude>");
        System.out.println("\t<Longitude>"+getLongitude()+"</Longitude>");
        System.out.println("\t<Precision>"+getPrecision()+"</Precision>");
        System.out.println("</xml>");
    }
}
