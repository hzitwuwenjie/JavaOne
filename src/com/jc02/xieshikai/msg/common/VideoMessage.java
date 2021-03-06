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
 * |　@create 2017年07月24日 - 16:30
 * |  @description   视频消息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class VideoMessage extends CommonMessage {
    private String mediaId;     //视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;//视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

    public VideoMessage(VideoType video) {
        super(video.toString());
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println("<ThumbMediaId><![CDATA["+getThumbMediaId()+"]]></ThumbMediaId>");
        System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
        System.out.println("</xml>");
    }
}
