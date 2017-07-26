package com.jc02.fjx.fulei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:53
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ShangBao extends ShiJianXiaoxi {
    private String  latitude;
    private String  longitude;
    private String  precision;

    public ShangBao() {
        super("location");
    }

    public void ShowXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println(" <FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println(" <Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("  <Latitude>"+getLatitude()+"</Latitude>");
        System.out.println("<Longitude>"+getLongitude()+"</Longitude>");
        System.out.println(" <Precision>"+getPrecision()+"</Precision>");
        System.out.println("</xml>");

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
