package com.jc02.wjm.message.eventmessage;

import com.jc02.wjm.message.EventMessage;
import com.jc02.wjm.message.EventType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 17:09
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Qrscene2 extends EventMessage {
    private String eventKey;//	事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id
    private String ticket;//	二维码的ticket，可用来换取二维码图片

    public Qrscene2(EventType event) {
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

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]</ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]</FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]</MsgType>");
        System.out.println("<Event><![CDATA["+getEvent()+"]]</Event>");
        System.out.println("<EventKey><![CDATA["+getEventKey()+"]]</EventKey>");
        System.out.println("<Ticket><![CDATA["+getTicket() + "]]</Ticket>");
        System.out.println("</xml>");

    }
}
