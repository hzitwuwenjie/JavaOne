package com.jc02.zengjing.message;

import com.jc02.zengjing.message.commenmessage.*;
import com.jc02.zengjing.message.eventmessage.*;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月25日 - 14:54
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("------------图片消息------------");
        ImageMessage i=new ImageMessage();
        i.setToUserName("曾靖");
        i.setFromUserName("熊大");
        i.setCreateTime(System.currentTimeMillis());
        i.setPicUrl("http://baidu.com");
        i.setMediaId("1101");
        i.showXml();
        System.out.println("------------视频消息------------");
        VideoMessage v=new VideoMessage(VideoType.shortvideo);
        v.setToUserName("曾靖");
        v.setFromUserName("熊大");
        v.setCreateTime(System.currentTimeMillis());
        v.setThumbMediaId("54854647");
        v.setMediaId("1102");
        v.showXml();
        System.out.println("------------文本消息------------");
        TextMessage t =new TextMessage();
        t.setToUserName("曾靖");
        t.setFromUserName("熊大");
        t.setCreateTime(System.currentTimeMillis());
        t.setContent("你好");
        t.showXml();
        System.out.println("------------链接消息------------");
        UrlMessage u =new UrlMessage();
        u.setToUserName("曾靖");
        u.setFromUserName("熊大");
        u.setCreateTime(System.currentTimeMillis());
        u.setTitle("图片链接");
        u.setDescription("好看的图");
        u.setUrl("http://baidu.com");
        u.showXml();
        System.out.println("------------位置消息------------");
        PositionMessage p =new PositionMessage();
        p.setToUserName("曾靖");
        p.setFromUserName("熊大");
        p.setCreateTime(System.currentTimeMillis());
        p.setlocation_X("121.1");
        p.setLocation_Y("99.1");
        p.setScale("缩小5000倍");
        p.setLabel("深圳");
        p.showXml();
        System.out.println("------------自定义菜单事件消息------------");
        DiyMessage d =new DiyMessage(DiyType.clink);
        d.setToUserName("曾靖");
        d.setFromUserName("熊大");
        d.setCreateTime(System.currentTimeMillis());
        d.setEventkey("key值");
        d.showXml();
        System.out.println("------------扫描二维码事件消息------------");
        ScanMessage s =new ScanMessage(EventType.subscribe);
        s.setToUserName("曾靖");
        s.setFromUserName("熊大");
        s.setCreateTime(System.currentTimeMillis());
        s.setEventKey("key值");
        s.setTicket("http://baidu.com");
        s.showXml();
        System.out.println("------------发送位置事件消息------------");
        LocalMessage l =new LocalMessage();
        l.setToUserName("曾靖");
        l.setFromUserName("熊大");
        l.setCreateTime(System.currentTimeMillis());
        l.setLatitude("121.1");
        l.setLongitude("95.1");
        l.setPrecision("1/5000");
        l.showXml();
    }
}