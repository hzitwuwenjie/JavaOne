package com.jc02.xiewenqiang.message.commonmessage;

import com.jc02.xiewenqiang.message.CommonMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:15
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends CommonMessage {
    private String content;//	文本消息内容

    public TextMessage() {
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content ) {
        this.content = content;
    }
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA[" + getToUserName() + "]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA[" + getFromUserName() + "]]></FromUserName>");
        System.out.println("\t<CreateTime>" + getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType><![CDATA[" + getMsgType() + "]]></MsgType>");
        System.out.println("\t<Content><![CDATA["+getContent()+"]]></Content>");
        System.out.println("\t<MsgId>" + getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}
