package com.jc02.xiewenqiang.message.commonmessage;

import com.jc02.xiewenqiang.message.CommonMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:33
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends CommonMessage {
    private String title;//	消息标题
    private String description;//	消息描述
    private String url;//	消息链接

    public LinkMessage() {
        super("link");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Title><!["+getTitle()+"]]></Title>");
        System.out.println("\t<Description><![CDATA["+getDescription()+"]]></Description>");
        System.out.println("\t<Url><![CDATA["+getUrl()+"]]></Url>");
        System.out.println("\t<MsgId>"+getMsgId()+"</MsgId>");
        System.out.println("</xml>");

    }
}
