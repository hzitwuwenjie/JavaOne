package com.jc02.huangkangming.message.commonmessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:24
 * |  @description   地理位置信息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage extends CommonMessage {
    private String location_x;
    private String location_y;
    private String scale;
    private String label;

    public LocationMessage() {
        super("location");
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Location_X><![CDATA["+getLocation_x()+"]></Location_X>");
        System.out.println("<Location_Y><![CDATA["+getLocation_y()+"]></Location_Y>");
        System.out.println("<Scale><![CDATA["+getScale()+"]></Scale>");
        System.out.println("<Label><![CDATA["+getLabel()+"]></Label>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]></MsgId>");
        System.out.println("</xml>");
    }

    public String getLocation_x() {
        return location_x;
    }

    public void setLocation_x(String location_x) {
        this.location_x = location_x;
    }

    public String getLocation_y() {
        return location_y;
    }

    public void setLocation_y(String location_y) {
        this.location_y = location_y;
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