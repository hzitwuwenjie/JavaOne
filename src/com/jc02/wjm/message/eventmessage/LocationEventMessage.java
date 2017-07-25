package com.jc02.wjm.message.eventmessage;

import com.jc02.wjm.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　;//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 17:04
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

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]</ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]</FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]</MsgType>");
        System.out.println("<Event><![CDATA["+getEvent()+"]]</Event>");
        System.out.println("<Latitude>"+getLatitude()+"</Latitude>");
        System.out.println("<Longitude>"+getLongitude() + "</Longitude>");
        System.out.println("<Precision>"+getPrecision() + "</Precision>");
        System.out.println("</xml>");

    }
}

