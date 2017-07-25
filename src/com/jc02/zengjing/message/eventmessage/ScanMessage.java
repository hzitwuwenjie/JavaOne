package com.jc02.zengjing.message.eventmessage;

import com.jc02.zengjing.message.EventMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:38
 * |  @description扫描带参数二维码事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class ScanMessage extends EventMessage {
    private String eventKey;
    private String ticket;

    public ScanMessage(EventType event) {
        super(event.toString());
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

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("<EventKey><![CDATA["+getEventKey()+"]]></EventKey>");
        System.out.println("<Ticket><![CDATA["+getTicket()+"]]></Ticket>");
        System.out.println("</xml>");
    }
}