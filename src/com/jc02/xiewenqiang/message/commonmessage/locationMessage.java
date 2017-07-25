package com.jc02.xiewenqiang.message.commonmessage;

import com.jc02.xiewenqiang.message.CommonMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:29
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class locationMessage extends CommonMessage {
    private String location_X;//	地理位置维度
    private String location_Y;//	地理位置经度
    private String scale;//	地图缩放大小
    private String label;//	地理位置信息

    public locationMessage() {
        super("location");
    }

    public String getLocation_X() {
        return location_X;

    }

    public void setLocation_X(String location_X) {
        this.location_X = location_X;
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

    public void showXml() {
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA[" + getToUserName() + "]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA[" + getFromUserName() + "]]></FromUserName>");
        System.out.println("\t<CreateTime>" + getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType><![CDATA[" + getMsgType() + "]]></MsgType>");
        System.out.println("\t<Location_X>" + getLocation_X() + "</Location_X>");
        System.out.println("\t<Location_X>" + getLocation_Y() + "</Location_X>");
        System.out.println("\t<Scale>" + getScale() + "</Scale>");
        System.out.println("\t<Label><![CDATA[" + getLabel() + "]]></Label>");
        System.out.println("\t<MsgId>" + getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}