package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:31
 * |  @description   地理位置消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage extends CommonMessage{

    private double location_X;
    private double location_Y;
    private double scale;
    private String label;

    public LocationMessage(){
        super("location");
    }

    public double getLocation_X() {
        return location_X;
    }

    public void setLocation_X(double location_X) {
        this.location_X = location_X;
    }

    public double getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(double location_Y) {
        this.location_Y = location_Y;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<Location_X>" + this.getLocation_X() + "</Location_X>");
        System.out.println("\t<Location_Y>" + this.getLocation_Y()+ "</Location_Y>");
        System.out.println("\t<Scale>" + this.getScale()+ "</Scale>");
        System.out.println("\t<Label>" + this.getLabel()+ "</Label>");
        System.out.println("\t<MsgId>" + this.getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}
