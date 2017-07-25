package com.jc02.yankaixin.test;

import com.jc02.yankaixin.message.*;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月25日 - 14:40
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage02 {

    public static void main(String[] args) {
        System.out.println("************文本消息************");
        TextMessage t = new TextMessage();
        t.setToUserName("严凯新");
        t.setFromUserName("周杰伦");
        t.setCreateTime(System.currentTimeMillis());
        t.setContent("哈哈哈哈");
        t.setMsgId(UUID.randomUUID().toString());
        t.showXml();
        System.out.println("************图片消息************");
        ImageMessage i = new ImageMessage();
        i.setToUserName("严凯新");
        i.setFromUserName("周杰伦");
        i.setCreateTime(System.currentTimeMillis());
        i.setPicUrl("4564564546564");
        i.setMediaId(100);
        i.setMsgId(UUID.randomUUID().toString());
        i.showXml();
        System.out.println("************语音消息************");
        VoiceMessage v = new VoiceMessage();
        v.setToUserName("严凯新");
        v.setFromUserName("周杰伦");
        v.setCreateTime(System.currentTimeMillis());
        v.setMediaId(100);
        v.setFormat("hahahaha");
        v.setMsgId(UUID.randomUUID().toString());
        v.showXml();
        System.out.println("************视频消息************");
        VideoMessage vi = new VideoMessage(VideoType.video);
        vi.setToUserName("严凯新");
        vi.setFromUserName("周杰伦");
        vi.setCreateTime(System.currentTimeMillis());
        vi.setMediaId(100);
        vi.setThumbMediaId(88);
        vi.setMsgId(UUID.randomUUID().toString());
        vi.showXml();
        System.out.println("************地理位置消息************");
        LocationMessage l = new LocationMessage();
        l.setToUserName("严凯新");
        l.setFromUserName("周杰伦");
        l.setCreateTime(System.currentTimeMillis());
        l.setLocation_X(55.5);
        l.setLocation_Y(66.6);
        l.setScale(100);
        l.setLabel("赤道");
        l.setMsgId(UUID.randomUUID().toString());
        l.showXml();
        System.out.println("************链接消息************");
        LinkMessage li = new LinkMessage();
        li.setToUserName("严凯新");
        li.setFromUserName("周杰伦");
        li.setCreateTime(System.currentTimeMillis());
        li.setTitle("哈哈哈");
        li.setDescription("呵呵呵");
        li.setUrl("https://www.baidu.com/baidu.png");
        li.setMsgId(UUID.randomUUID().toString());
        li.showXml();
        System.out.println("************扫描二维码事件消息************");
        QrSceneMessage q = new QrSceneMessage(EventType.SCAN);
        q.setToUserName("严凯新");
        q.setFromUserName("周杰伦");
        q.setCreateTime(System.currentTimeMillis());
        q.setEventKey("hahaha");
        q.setTicket("hehe");
        q.showXml();
        System.out.println("************上报地理位置事件消息************");
        ReportLocationMessage r = new ReportLocationMessage();
        r.setToUserName("严凯新");
        r.setFromUserName("周杰伦");
        r.setCreateTime(System.currentTimeMillis());
        r.setLatitude(55.5);
        r.setLongitude(66.5);
        r.setPrecision(78);
        r.showXml();
        System.out.println("************自定义菜单事件消息************");
        ClickMessage c = new ClickMessage(ClickType.click);
        c.setToUserName("严凯新");
        c.setFromUserName("周杰伦");
        c.setCreateTime(System.currentTimeMillis());
        c.setEventKey("haha");
        c.showXml();

    }
}
