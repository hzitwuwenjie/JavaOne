package com.jc02.xieshuyuan.lianxi.entity.message.eventmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 17:06
 * |    @description   上报地理位置事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ReportLocationEventMessage extends EventMessage{
    private String latitude;	//地理位置纬度
    private String longitude;	//地理位置经度
    private String precision;	//地理位置精度

    public ReportLocationEventMessage(){
        super("event","subscribe");
    }
    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<Latitude>23.137466</Latitude>");
        System.out.println("\t<Longitude>113.352425</Longitude>");
        System.out.println("\t<Precision>119.385040</Precision>");
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
