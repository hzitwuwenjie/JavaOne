package com.jc02.xiewenqiang.test;

import com.jc02.xiewenqiang.message.commonmessage.*;


/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月25日 - 10:05
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        System.out.println("==========================文本消息=========================");
        TextMessage textMessage = new TextMessage();
        textMessage.setToUserName("小明");
        textMessage.setFromUserName("张三");
        textMessage.setCreateTime(System.currentTimeMillis());
        textMessage.setContent("你好");
        textMessage.showXml();

        System.out.println("==========================图片消息=========================");
        ImageMessage imageMessage = new ImageMessage();
        imageMessage.setToUserName("小明");
        imageMessage.setFromUserName("张三");
        imageMessage.setCreateTime(System.currentTimeMillis());
        imageMessage.setPicUrl("www.baidu.com");
        imageMessage.showXml();

        System.out.println("==========================连接消息=========================");
        LinkMessage linkMessage = new LinkMessage();
        linkMessage.setToUserName("小明");
        linkMessage.setFromUserName("张三");
        linkMessage.setCreateTime(System.currentTimeMillis());
        linkMessage.setUrl("www.sougou.com");
        linkMessage.setMsgId(100001);
        linkMessage.showXml();

        System.out.println("==========================地理位置消息=========================");
        locationMessage loc = new locationMessage();
        loc.setToUserName("小明");
        loc.setFromUserName("张三");
        loc.setCreateTime(System.currentTimeMillis());
        loc.setLocation_X("20");
        loc.setLocation_Y("48");
        loc.setMsgId(1001);
        loc.showXml();

        System.out.println("==========================视频消息=========================");
        VedioMessage vedioMessage = new VedioMessage("shortvedio");
        vedioMessage.setToUserName("小明");
        vedioMessage.setFromUserName("张三");
        vedioMessage.setMsgId(1001);
        vedioMessage.showXml();
    }
}
