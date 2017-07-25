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
 * |　@create 2017年07月24日 - 16:30
 * |    @description   链接消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class UrlMessage extends CommonMessage {
    private String title;
    private String description;
    private String url;
    public UrlMessage() {
        super("link");
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Title><![CDATA["+getTitle()+"]]></Title>");
        System.out.println("\t<Url>"+getUrl()+"</Url>");
        System.out.println("\t<MsgId>"+getMsgid()+"</MsgId>");
        System.out.println("</xml>");
    }
}