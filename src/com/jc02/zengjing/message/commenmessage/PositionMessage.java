package com.jc02.zengjing.message.commenmessage;

import com.jc02.zengjing.message.ComMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:29
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class PositionMessage extends ComMessage {
    private String location_X;
    private String location_Y;
    private String scale;
    private String label;

    public PositionMessage() {
        super("localtion");
    }

    public String getlocation_X() {
        return location_X;
    }

    public void setlocation_X(String ocation_X) {
        this.location_X = ocation_X;
    }

    public String getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(String location_Y) {
        this.location_Y = location_Y;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Location_X><![CDATA["+getlocation_X()+"]]></Location_X>");
        System.out.println("<Location_Y><![CDATA["+getLocation_Y()+"]]></Location_Y>");
        System.out.println("<Scale><![CDATA["+getScale()+"]]></Scale>");
        System.out.println("<Label><![CDATA["+getLabel()+"]]></Label>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
        System.out.println("</xml>");
    }
}