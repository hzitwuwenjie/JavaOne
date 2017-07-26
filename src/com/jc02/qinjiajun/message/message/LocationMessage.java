package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:25
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage extends  Message {
    public String location_X;
    public String location_Y;
    public String scale;
    public String label;

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<location_X><![CDATA["+getLocation_X() +" ]]></location_X>");
        System.out.println("<location_Y><![CDATA["+getLocation_Y()+" ]]></location_Y>");
        System.out.println("<scale><![CDATA["+getScale()+" ]]></scale>");
        System.out.println("<label><![CDATA["+getLabel()+" ]]></label>");
        System.out.println("<MsgId> " + getMsgId() +"</MsgId>");
        System.out.println("<xml>");

    }

    public LocationMessage(){
        super("Location");
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