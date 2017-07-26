package com.jc02.xieshikai.msg.common;

import java.util.UUID;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月24日 - 16:38
 * |  @description   链接消息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class LinkMessage extends CommonMessage {
    private String title;       //消息标题
    private String description; //消息描述
    private String url;         //消息链接

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

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Title><![CDATA["+getTitle()+"]]></Title>");
        System.out.println("<Description><![CDATA["+getDescription()+"]]></Description>");
        System.out.println("<Url><![CDATA["+getUrl()+"]]></Url>");
        System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
        System.out.println("</xml>");
    }
}
