package com.jc02.zoudongping.message.eventmessage;

import com.jc02.zoudongping.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:37
 * |    @description   扫描带参数二维码事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class ScanMessage extends EventMessage {
    private int eventkey;
    private String ticket;


    public ScanMessage(ScanType event) {
        super(event.toString());
    }


    public int getEventkey() {
        return eventkey;
    }

    public void setEventkey(int eventkey) {
        this.eventkey = eventkey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<EventKey>"+getEventkey()+"</EventKey>");
        System.out.println("\t<Ticket>"+getTicket()+"</Ticket>");
        System.out.println("</xml>");
    }
}