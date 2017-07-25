package com.jc02.zoudongping.message.eventmessage;

import com.jc02.zoudongping.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:54
 * |    @description   自定义菜单事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class ClickMessage extends EventMessage {
    private long eventkey;

    public ClickMessage() {
        super("click");
    }

    public long getEventkey() {
        return eventkey;
    }

    public void setEventkey(long eventkey) {
        this.eventkey = eventkey;
    }

    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<EventKey>"+getEventkey()+"</EventKey>");
        System.out.println("</xml>");
    }
}