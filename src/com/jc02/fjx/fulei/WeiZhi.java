package com.jc02.fjx.fulei;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:35
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class WeiZhi extends PuTongXiaoxi {
    private String location_X;
    private  String location_Y;
    private  String scale;
    private  String label;
    public  WeiZhi(){
        super("location");
    }

    public void ShowXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA[" + getToUserName() + "]]></ToUserName>");
        System.out.println(" <FromUserName><![CDATA[" + getFromUserName() + "]]></FromUserName>");
        System.out.println("<CreateTime>" + System.currentTimeMillis() + "</CreateTime>");
        System.out.println("<MsgType><![CDATA[" + getMsgType() + "]]></MsgType>");
        System.out.println(" <Location_X>" + getLocation_X() + "</Location_X>");
        System.out.println(" <Location_Y>" + getLocation_Y() + "</Location_Y>");
        System.out.println(" <Scale>" + getScale() + "</Scale>");
        System.out.println("  <Label><![CDATA[" + getLabel() + "]]></Label>");
        System.out.println("<MsgId>" + UUID.randomUUID().toString() + "</MsgId>");
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
