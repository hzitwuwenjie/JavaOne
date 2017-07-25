package com.jc02.zoudongping.message.commonmessage;

import com.jc02.zoudongping.message.CommonMessage;
import com.jc02.zoudongping.message.Message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:27
 * |    @description   地理位置信息
 * +---------------------------------Oooo---------------------------------------+
 */
public class PointMessage extends CommonMessage {
    private double location_x;
    private double location_y;
    private  String scale;
    private String label;

    public PointMessage() {
        super("location");
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getLocation_x() {
        return location_x;
    }

    public void setLocation_x(double location_x) {
        this.location_x = location_x;
    }

    public double getLocation_y() {
        return location_y;
    }

    public void setLocation_y(double location_y) {
        this.location_y = location_y;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Location_X><![CDATA["+getLocation_x()+"]]></Location_X>");
        System.out.println("\t<Location_Y>"+getLocation_y()+"</Location_Y>");
        System.out.println("\t<Scale>"+getScale()+"</Scale>");
        System.out.println("\t<Label>"+getLabel()+"</Label>");
        System.out.println("\t<MsgId>"+getMsgid()+"</MsgId>");
        System.out.println("</xml>");
    }
}