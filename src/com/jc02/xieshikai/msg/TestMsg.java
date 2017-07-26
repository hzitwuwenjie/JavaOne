package com.jc02.xieshikai.msg;

import com.jc02.xieshikai.msg.common.CommonMessage;
import com.jc02.xieshikai.msg.common.TextMessage;

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
//        //文本消息
//        TextMessage text=new TextMessage();
//        System.out.println(text.getMsgType());
//        //图片消息
//        PicMessage picture=new PicMessage();
//        System.out.println(picture.getMsgType());
//        //语音消息
//        VoiceMessage voice=new VoiceMessage();
//        System.out.println(voice.getMsgType());
//        //视频消息
//        VideoMessage video=new VideoMessage(VideoType.video);
//        System.out.println(video.getMsgType());
//        //小视频消息
//        VideoMessage shortvideo=new VideoMessage(VideoType.shortvideo);
//        System.out.println(shortvideo.getMsgType());
//
//        //地理位置消息
//        LocationMessage location=new LocationMessage();
//        System.out.println(location.getMsgType());
//        //链接消息
//        LinkMessage link=new LinkMessage();
//        System.out.println(link.getMsgType());
//        //自定义菜单事件
//        ClickEventMessage click=new ClickEventMessage();
//        System.out.println(click.getMsgType());
//        System.out.println(click.getEvent());
//        //上报地理位置事件
//        LocationEventMessage locationEvent=new LocationEventMessage();
//        System.out.println(locationEvent.getMsgType());
//        System.out.println(locationEvent.getEvent());
//        //扫描带参数二维码事件
//        ScanEventMessage scan1=new ScanEventMessage(ScanEventType.SCAN);
//        System.out.println(scan1.getMsgType());
//        System.out.println(scan1.getEvent());
//        //
//
//        ScanEventMessage scan2=new ScanEventMessage(ScanEventType.subscribe);
//        System.out.println(scan2.getMsgType());
//        System.out.println(scan2.getEvent());
//        //
//        ScanEventMessage scan3=new ScanEventMessage(ScanEventType.unsubscribe);
//        System.out.println(scan3.getMsgType());
//        System.out.println(scan3.getEvent());
//        //点击菜单跳转链接时的事件推送
//        ViewEventMessage view=new ViewEventMessage();
//        System.out.println(view.getMsgType());
//        System.out.println(view.getEvent());
        System.out.println("-----------------------文本消息----------------------");
        TextMessage t=new TextMessage();
        t.setToUserName("谢士凯");
        t.setFromUserName("合众艾特");
        t.setCreateTime(System.currentTimeMillis());
        t.setContent("Hello!");
        t.showXml();
        System.out.println("-----------------------------------------------------");
//        System.out.println("-----------------------图片消息----------------------");
//        CommonMessage.PicMessage p=new CommonMessage.PicMessage();
//        p.setToUserName("谢士凯");
//        p.setFromUserName("合众艾特");
//        p.setCreateTime(System.currentTimeMillis());
//        p.setPicUrl("www.baidu.com");
//        p.setMediaId("http://image.baidu.com/");
//        p.showXml();
//        System.out.println("-----------------------------------------------------");
//        System.out.println("-----------------------语音消息----------------------");
//        CommonMessage.VoiceMessage vo=new CommonMessage.VoiceMessage();
//        vo.setToUserName("谢士凯");
//        vo.setFromUserName("合众艾特");
//        vo.setCreateTime(System.currentTimeMillis());
//        vo.setMediaId("http://image.baidu.com/");
//        vo.setFormat("amr");
//        vo.showXml();
//        System.out.println("-----------------------------------------------------");
//        System.out.println("----------------------视频消息----------------------");
//        CommonMessage.VideoMessage vi=new CommonMessage.VideoMessage(CommonMessage.VideoType.video);
//        vi.setToUserName("谢士凯");
//        vi.setFromUserName("合众艾特");
//        vi.setCreateTime(System.currentTimeMillis());
//        vi.setMediaId("http://image.baidu.com/");
//        vi.setThumbMediaId("rmvb");
//        vi.showXml();
//        System.out.println("-----------------------------------------------------");
//        System.out.println("----------------------位置消息----------------------");
//        CommonMessage.LocationMessage lo=new CommonMessage.LocationMessage();
//        lo.setToUserName("谢士凯");
//        lo.setFromUserName("合众艾特");
//        lo.setCreateTime(System.currentTimeMillis());
//        lo.setLocation_X(155.55);
//        lo.setLocation_y(155.55);
//        lo.setScale(100);
//        lo.setLabel("未知位置！");
//        lo.showXml();
//        System.out.println("-----------------------------------------------------");
//        System.out.println("----------------------位置消息----------------------");
//        CommonMessage.LinkMessage li=new CommonMessage.LinkMessage();
//        li.setToUserName("谢士凯");
//        li.setFromUserName("合众艾特");
//        li.setCreateTime(System.currentTimeMillis());
//        li.setTitle("合众艾特上市啦！");
//        li.setDescription("怎么上的?");
//        li.setUrl("https://baike.baidu.com/item/%E4%B8%8A%E5%B8%82/2903553?fr=aladdin");
//        li.showXml();
//        System.out.println("-----------------------------------------------------");

    }
}
