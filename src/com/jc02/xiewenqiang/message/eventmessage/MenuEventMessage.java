package com.jc02.xiewenqiang.message.eventmessage;

import com.jc02.xiewenqiang.message.EventMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:47
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class MenuEventMessage extends EventMessage {
    private String eventKey;//	事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String ticket;//	二维码的ticket，可用来换取二维码图片

    public MenuEventMessage(String event) {
        super(event);
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket( String ticket) {
        this.ticket = ticket;
    }

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA[toUser]]>"+getToUserName()+"</ToUserName>");
        System.out.println("\t<FromUserName><![CDATA[fromUser]]>"+getFromUserName()+"</FromUserName>");
        System.out.println("\t<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA[event]]>"+getMsgType()+"</MsgType>");
        System.out.println("\t<Event><![CDATA[LOCATION]]>"+getEvent()+"</Event>");
        System.out.println("\t<EventKey><![CDATA[EVENTKEY]]>"+getEventKey()+"</EventKey>");
        System.out.println("</xml>");
    }
}
