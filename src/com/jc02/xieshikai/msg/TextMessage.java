package com.jc02.xieshikai.msg;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月24日 - 16:16
 * |  @description   文本消息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class TextMessage extends CommonMessage{
    private String content;//文本消息内容

    public TextMessage(){
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println(" <Content><![CDATA["+getContent()+"]]></Content>");
        System.out.println("<MsgId>"+getMsgId()+"</MsgId>");
        System.out.println("</xml>");
    }
}
