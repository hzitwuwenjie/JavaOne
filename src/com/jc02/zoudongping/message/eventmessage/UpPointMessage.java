package com.jc02.zoudongping.message.eventmessage;

import com.jc02.zoudongping.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:42
 * |    @description   上报地理位置
 * +---------------------------------Oooo---------------------------------------+
 */
public class UpPointMessage extends EventMessage {
    private double latitude;
    private double longitude;
    private double precision;

    public UpPointMessage() {
        super("LOCATION");
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
    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<Latitude>"+getLatitude()+"</Latitude>");
        System.out.println("\t<Longitude>"+getLongitude()+"</Longitude>");
        System.out.println("\t<Precision>"+getPrecision()+"</Precision>");
        System.out.println("</xml>");
    }
}