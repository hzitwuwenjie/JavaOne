package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:28
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class PositionMessage extends CommonMessage {
    private long location_X;
    private long location_Y;
    private String scale;
    private String label;

    public PositionMessage() {
        super("location");
    }
    public void showxml(){
        System.out.println("<xml>");

        System.out.println("<toUserName><![CDATA["+getToUserName()+"]]></toUserName>");
        System.out.println("<toFromUserName><![CDATA["+getFromUserName()+"]]></toFromUserName>");
        System.out.println("<toLocation_X><![CDATA["+getLocation_X()+"]]><toLocation_X>");
        System.out.println("<toCreateTime><![CDATA["+getCreateTime()+")]]><toCreateTime>");
        System.out.println("<toMsgType><![CDATA["+getMsgType()+"]]></toMsgType>");
        System.out.println("<toLocation_Y><![CDATA["+getLocation_Y()+"]]></toLocation_Y>");
        System.out.println("<toMsgId><![CDATA["+getMsgId()+")]]></toMsgId>");
        System.out.println("<toLabel><![CDATA["+getLabel()+")]]></toLabel>");
        System.out.println("<toScale><![CDATA["+getScale()+")]]></toScale>");
        System.out.println("</xml>");


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

    public long getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(long location_Y) {
        this.location_Y = location_Y;
    }

    public long getLocation_X() {
        return location_X;
    }

    public void setLocation_X(long location_X) {
        this.location_X = location_X;
    }



}
