package com.jc02.huangkangming.message.test;

import com.jc02.huangkangming.message.commonmessage.*;
import com.jc02.huangkangming.message.type.VideoType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 14:45
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage2 {
    public static void main(String[] args) {

        TextMessage tm =new TextMessage();
        System.out.println("=================================文本消息=================================");
        tm.setToUserName("张三");
        tm.setFromUserName("黄康明");
        tm.setCreateTime(System.currentTimeMillis());
        tm.setContent("今天晚上一起去吃饭。");
        tm.showXml();

        PicMessage pm=new PicMessage();
        System.out.println("=================================图片消息=================================");
        pm.setToUserName("张三");
        pm.setFromUserName("黄康明");
        pm.setCreateTime(System.currentTimeMillis());
        pm.setPicURL("www.hao123.com/baidu/dog.gif");
        pm.setMediaId("11111");
        pm.showXml();

        VoiceMessage vm=new VoiceMessage();
        System.out.println("=================================语音消息=================================");
        vm.setToUserName("张三");
        vm.setFromUserName("黄康明");
        vm.setCreateTime(System.currentTimeMillis());
        vm.setMediaId("11111");
        vm.setFormat("amr");
        vm.showXml();

        VideoMessage vm1=new VideoMessage(VideoType.video);
        System.out.println("=================================视频消息=================================");
        vm1.setToUserName("张三");
        vm1.setFromUserName("黄康明");
        vm1.setCreateTime(System.currentTimeMillis());
        vm1.setMediaId("22222");
        vm1.setThumbMediaId("888888");
        vm1.showXml();


        LocationMessage lm=new LocationMessage();
        System.out.println("=================================地理位置消息=================================");
        lm.setToUserName("张三");
        lm.setFromUserName("黄康明");
        lm.setCreateTime(System.currentTimeMillis());
        lm.setLocation_x("1324");
        lm.setLocation_y("5436");
        lm.setScale("150%");
        lm.setLabel("中国");
        lm.showXml();

        LinkMessage lm1=new LinkMessage();
        System.out.println("=================================链接消息=================================");
        lm1.setToUserName("张三");
        lm1.setFromUserName("黄康明");
        lm1.setCreateTime(System.currentTimeMillis());
        lm1.setTitle("Java程序设计");
        lm1.setDescription("Java编程");
        lm1.setUrl("www.baidu.com");
        lm1.showXml();
    }
}