package com.jc02.zengjing.message.eventmessage;

import com.jc02.zengjing.message.EventMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:56
 * |  @description自定义菜单事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class DiyMessage extends EventMessage {
    private String eventkey;

    public DiyMessage(DiyType event) {
        super(event.toString());
    }

    public String getEventkey() {
        return eventkey;
    }

    public void setEventkey(String eventkey) {
        this.eventkey = eventkey;
    }
    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("<EventKey><![CDATA["+getEventkey()+"]]></EventKey>");
        System.out.println("</xml>");
    }
}