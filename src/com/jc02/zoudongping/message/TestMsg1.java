package com.jc02.zoudongping.message;

import com.jc02.qinjiajun.message.message.UpLocationEventMessage;
import com.jc02.zoudongping.message.commonmessage.*;
import com.jc02.zoudongping.message.eventmessage.ClickMessage;
import com.jc02.zoudongping.message.eventmessage.ScanMessage;
import com.jc02.zoudongping.message.eventmessage.ScanType;
import com.jc02.zoudongping.message.eventmessage.UpPointMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 15:16
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMsg1 {
    public static void main(String[] args) {
        System.out.println("=================文本消息=====================");
        TextMessage txt=new TextMessage();
        txt.setTousername("我");
        txt.setFromusername("你");
        txt.setCreatetime(20170725);
        txt.setContent("呵呵");
        txt.setMsgid(88888888);
        txt.showXml();
        System.out.println("=================图片消息=====================");
        ImgMessage img=new ImgMessage();
        img.setTousername("我");
        img.setFromusername("你");
        img.setCreatetime(20170725);
        img.setPicurl("www.baidu.com");
        img.setMediaid("666");
        img.setMsgid(666);
        img.showXml();
        System.out.println("==================视频消息=====================");
        MediaMessage med=new MediaMessage(VideoType.video);
        med.setTousername("我");
        med.setFromusername("你");
        med.setCreatetime(20170725);
        med.setMediaid("666");
        med.setThumbmediaid("666");
        med.setMsgid(666);
        med.showXml();
        System.out.println("==================地理位置消息==================");
        PointMessage pmsg=new PointMessage();
        pmsg.setTousername("我");
        pmsg.setFromusername("你");
        pmsg.setCreatetime(20170725);
        pmsg.setLocation_x(179.99);
        pmsg.setLocation_y(145.34);
        pmsg.setScale("666");
        pmsg.setLabel("666");
        pmsg.setMsgid(666);
        pmsg.showXml();

        System.out.println("=====================链接消息==================");
        UrlMessage url=new UrlMessage();
        url.setTousername("我");
        url.setFromusername("你");
        url.setCreatetime(20170725);
        url.setTitle("898");
        url.setDescription("666");
        url.setUrl("www.baidu.com");
        url.setMsgid(666);
        url.showXml();
        System.out.println("=====================语音消息==================");
        VoiceMessage vmsg=new VoiceMessage();
        vmsg.setTousername("我");
        vmsg.setFromusername("你");
        vmsg.setCreatetime(20170725);
        vmsg.setFormat("arm");
        vmsg.setMediaid("666");
        vmsg.setMsgid(666);
        vmsg.showXml();
        System.out.println("==================扫描事件消息==================");
        ScanMessage scan=new ScanMessage(ScanType.SCAN);
        scan.setTousername("我");
        scan.setFromusername("你");
        scan.setCreatetime(20170725);
        scan.setEventkey(666);
        scan.setTicket("666");
        scan.showXml();
        System.out.println("===============上报地理位置事件消息==============");
        UpPointMessage up=new UpPointMessage();
        up.setTousername("我");
        up.setFromusername("你");
        up.setCreatetime(20170725);
        up.setLatitude(155.12);
        up.setLongitude(66.52);
        up.setPrecision(0.001);
        up.showXml();
        System.out.println("===============自定义菜单事件消息==============");
        ClickMessage cmsg=new ClickMessage();
        cmsg.setTousername("我");
        cmsg.setFromusername("你");
        cmsg.setCreatetime(20170725);
        cmsg.setEventkey(168);
        cmsg.showXml();
    }
}