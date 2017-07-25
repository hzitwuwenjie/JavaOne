package com.jc02.wjm.message.commonmessage;

import com.jc02.wjm.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:28
 * |  @description   地理位置
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage extends CommonMessage {
    private String location_X;//	地理位置维度
    private String location_Y;	//地理位置经度
    private String scale;	//地图缩放大小
    private String label;	//地理位置信息

    public LocationMessage() {
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

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]</ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]</FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]</MsgType>");
        System.out.println("<Location_X()><![CDATA["+getLocation_X()+"]]</Location_X()>");
        System.out.println("<Location_Y()><![CDATA["+getLocation_Y()+"]]</Location_Y()>");
        System.out.println("<Scale><![CDATA["+getScale()+"]]</Scale>");
        System.out.println("<Label><![CDATA["+getLabel()+"]]</Label>>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]]</MsgId>");
        System.out.println("</xml>");


    }
}
