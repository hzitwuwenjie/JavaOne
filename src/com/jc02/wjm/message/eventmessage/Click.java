package com.jc02.wjm.message.eventmessage;

import com.jc02.wjm.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:52
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Click extends EventMessage {
    private String eventKey;//	事件KEY值，与自定义菜单接口中KEY值对应

    public Click() {
        super("click");
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
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
        System.out.println("</xml>");

    }
}
