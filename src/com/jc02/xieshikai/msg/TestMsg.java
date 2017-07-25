package com.jc02.xieshikai.msg;

import com.jc02.fankelei.massage.VedioMessage;
import com.jc02.wjm.message.Click;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月25日 - 10:00
 * |  @description   测试信息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class TestMsg {
    public static void main(String[] args) {
        //文本消息
        ContentMessage text=new ContentMessage();
        System.out.println(text.getMsgType());
        //图片消息
        PicMessage picture=new PicMessage();
        System.out.println(picture.getMsgType());
        //语音消息
        VoiceMessage voice=new VoiceMessage();
        System.out.println(voice.getMsgType());
        //视频消息
        VideoMessage video=new VideoMessage(VideoType.video);
        System.out.println(video.getMsgType());
        //小视频消息
        VideoMessage shortvideo=new VideoMessage(VideoType.shortvideo);
        System.out.println(shortvideo.getMsgType());

        //地理位置消息
        LocationMessage location=new LocationMessage();
        System.out.println(location.getMsgType());
        //链接消息
        LinkMessage link=new LinkMessage();
        System.out.println(link.getMsgType());
        //自定义菜单事件
        ClickEventMessage click=new ClickEventMessage();
        System.out.println(click.getMsgType());
        System.out.println(click.getEvent());
        //上报地理位置事件
        LocationEventMessage locationEvent=new LocationEventMessage();
        System.out.println(locationEvent.getMsgType());
        System.out.println(locationEvent.getEvent());
        //扫描带参数二维码事件
        ScanEventMessage scan1=new ScanEventMessage(ScanEventType.SCAN);
        System.out.println(scan1.getMsgType());
        System.out.println(scan1.getEvent());
        //
        ScanEventMessage scan2=new ScanEventMessage(ScanEventType.subscribe);
        System.out.println(scan2.getMsgType());
        System.out.println(scan2.getEvent());
        //
        ScanEventMessage scan3=new ScanEventMessage(ScanEventType.unsubscribe);
        System.out.println(scan3.getMsgType());
        System.out.println(scan3.getEvent());
        //点击菜单跳转链接时的事件推送
        ViewEventMessage view=new ViewEventMessage();
        System.out.println(view.getMsgType());
        System.out.println(view.getEvent());
    }
}
