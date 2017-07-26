package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:34
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class UpLocationEventMessage extends  EventMessage {
    public String latitude;
    public String longitude;
    public String precision;
    public UpLocationEventMessage(){
        super("Location");
    }

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<latitude><![CDATA["+getLatitude()  +" ]]></latitude>");
        System.out.println("<longitude><![CDATA["+getLongitude()  +" ]]></longitude>");
        System.out.println("<precision><![CDATA["+getPrecision()  +" ]]></precision>");
        System.out.println("<MsgId> " + getEvent() +"</MsgId>");
        System.out.println("<xml>");

    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }
}