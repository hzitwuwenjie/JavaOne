package com.jc02.zoudongping.message.commonmessage;

import com.jc02.zoudongping.message.CommonMessage;
import com.jc02.zoudongping.message.Message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:16
 * |    @description   文本消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends CommonMessage {
    private String content;

    public TextMessage(){
        super("text");
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Content><![CDATA["+getContent()+"]]></Content>");
        System.out.println("\t<MsgId>"+getMsgid()+"</MsgId>");
        System.out.println("</xml>");
    }
}