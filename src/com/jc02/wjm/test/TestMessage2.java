package com.jc02.wjm.test;

import com.jc02.weiyilun.entity.commonmessage.Voice;
import com.jc02.wjm.message.EventType;
import com.jc02.wjm.message.VideoType;
import com.jc02.wjm.message.commonmessage.*;
import com.jc02.wjm.message.eventmessage.Click;
import com.jc02.wjm.message.eventmessage.LocationEventMessage;
import com.jc02.wjm.message.eventmessage.Qrscene2;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 14:50
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage2 {
    public static void main(String[] args) {
        TextMessage tx = new TextMessage();
        tx.setToUserName("万家明");
        tx.setFromUserName("范珂磊");
        tx.setCreateTime(System.currentTimeMillis());
        tx.setContent("吃点东西");
        System.out.println("=============文本消息================");
        tx.showXml();
        System.out.println("====================================");
        ImageMessage im = new ImageMessage();
        im.setToUserName("小碗");
        im.setFromUserName("小范");
        im.setCreateTime(System.currentTimeMillis());
        im.setPicUrl("www.baidu.com");
        im.setMediaId("10086");
        System.out.println("=============图片消息================");
        im.showXml();
        System.out.println("====================================");
        VoiceMessage vo=new VoiceMessage();
        vo.setToUserName("小万");
        vo.setFromUserName("小曾");
        vo.setCreateTime(System.currentTimeMillis());
        vo.setFormat("amr");
        vo.setMediaId("10010");
        System.out.println("=============语音消息================");
        vo.showXml();
        System.out.println("====================================");
        VideoMessage vi=new VideoMessage(VideoType.shortvideo);
        vi.setToUserName("小万");
        vi.setFromUserName("小魏");
        vi.setCreateTime(System.currentTimeMillis());
        vi.setThumbMediaId("120");
        vi.setMediaId("10010");
        System.out.println("=============视频消息================");
        vi.showXml();
        System.out.println("====================================");
        LocationMessage lo=new LocationMessage();
        lo.setToUserName("万小");
        lo.setFromUserName("小魏");
        lo.setCreateTime(System.currentTimeMillis());
        lo.setLocation_X("66");
        lo.setLocation_Y("88");
        lo.setLabel("0.8");
        lo.setScale("南昌");
        System.out.println("=============地址消息================");
        lo.showXml();
        System.out.println("====================================");
        UrlMessage url=new UrlMessage();
        url.setToUserName("笑笑");
        url.setFromUserName("呵呵");
        url.setCreateTime(System.currentTimeMillis());
        url.setTitle("震惊，男默女泪");
        url.setDescription("身为一个学生他竟然做出这种事");
        url.setUrl("www.4399.com");
        System.out.println("=============链接消息================");
        url.showXml();
        System.out.println("====================================");
        Qrscene2 qr=new Qrscene2(EventType.unsubscribe);
        qr.setToUserName("万万万");
        qr.setFromUserName("小小小");
        qr.setCreateTime(System.currentTimeMillis());
        qr.setEventKey("key1");
        qr.setTicket("二维码");
        System.out.println("=============二维码事件消息================");
        qr.showXml();
        System.out.println("====================================");
        Click cl=new Click();
        cl.setToUserName("小婉");
        cl.setFromUserName("小小小");
        cl.setCreateTime(System.currentTimeMillis());
        cl.setEventKey("www.baidu.com");
        System.out.println("=============菜单事件消息=================");
        cl.showXml();
        System.out.println("====================================");
        LocationEventMessage loe=new LocationEventMessage();
        loe.setToUserName("小婉小");
        loe.setFromUserName("小饭小");
        loe.setCreateTime(System.currentTimeMillis());
        loe.setLatitude("23.123");
        loe.setLongitude("66.145");
        loe.setPrecision("6.786");
        System.out.println("=============地址事件消息================");
        loe.showXml();
        System.out.println("====================================");





    }
}