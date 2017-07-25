package com.jc02.zengjing.message.commenmessage;

import com.jc02.zengjing.message.ComMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:15
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends ComMessage {
    private String content;

    public TextMessage() {
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        content = content;
    }

    public String toString(){
        return getFromUserName()+"发送了一条文本信息给"+getToUserName()+"内容是："+getContent();
    }

    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Content><![CDATA["+getContent()+"]]></Content>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
        System.out.println("</xml>");
    }
}