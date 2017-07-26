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
 * |　@create 2017年07月24日 - 16:23
 * |  @description   图片消息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class PicMessage extends CommonMessage {
    private String picUrl;  //图片链接（由系统生成）
    private String mediaId; //图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    public PicMessage() {
        super("image");
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<PicUrl><![CDATA["+getPicUrl()+"]]></PicUrl>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
        System.out.println("</xml>");
    }
}
