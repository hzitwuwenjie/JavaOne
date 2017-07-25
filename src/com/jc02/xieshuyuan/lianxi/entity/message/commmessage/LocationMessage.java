package com.jc02.xieshuyuan.lianxi.entity.message.commmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.CommMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:33
 * |    @description   地理位置消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage extends CommMessage {
    private String location_X;	//地理位置维度
    private String location_Y;	//地理位置经度
    private String scale;	//地图缩放大小
    private String label;	//地理位置信息

    public LocationMessage(){
        super("location");
    }
    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Location_X><![CDATA["+getLocation_X()+"]]></Location_X>");
        System.out.println("\t<Location_Y><![CDATA["+getLocation_Y()+"]]></Location_Y>");
        System.out.println("\t<Scale><![CDATA["+getScale()+"]]></Scale>");
        System.out.println("\t<Label><![CDATA["+getLabel()+"]]></Label>");
        System.out.println("\t<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
        System.out.println("</xml>");
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
}
