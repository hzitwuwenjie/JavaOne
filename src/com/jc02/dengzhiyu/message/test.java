package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月25日 - 10:04　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class test {
    public static void main(String[] args) {
        System.out.println("===================图片消息=======================");
        ImageMessage img=new ImageMessage();
        img.setFromUserName("彭美倩");
        img.setToUserName("邓智宇");
        img.setCreateTime(System.currentTimeMillis());
        img.setPicUrl("this is a url");
        img.setMediaId("1001");
        img.showxml();

        System.out.println("===================文本消息=======================");
        TextMessage te=new TextMessage();
        te.setContent("你好");
        te.getMsgType();
        te.setFromUserName("彭美倩");
        te.setToUserName("刘雪琴");
        te.showxml();


        System.out.println("===================视频消息=======================");
        VideoMessage vi=new VideoMessage(VideoType.shortvideo);
        vi.setToUserName("彭美倩");
        vi.setFromUserName("刘雪琴");
        vi.setMediaId("100111");
        vi.setThumbMediaId("10101010");
        vi.getMsgType();
        vi.showxml();


        System.out.println("===================语音消息=======================");
        VoiceMessage vo=new VoiceMessage();
        vo.setToUserName("彭美倩");
        vo.setFromUserName("刘雪琴");
        vo.setMediaId("100111");
        vo.setFormat("amr");
        vo.getMsgType();
        vo.showxml();
        System.out.println("===================链接消息=======================");
        LinkMessage li=new LinkMessage();
        li.setToUserName("彭美倩");
        li.setFromUserName("刘雪琴");
        li.setDescription("淘宝热卖");
        li.setTitle("好物分享");
        li.setUrl("http://www.tao.com");
        li.getMsgType();
        li.showxml();

        System.out.println("===================地址消息=======================");
        LocationMessage loca=new LocationMessage();
        loca.setToUserName("彭美倩");
        loca.setFromUserName("刘雪琴");
        loca.setLabel("深圳宝安");
        loca.setLocation_X("23.134521");
        loca.setLocation_Y("113.358803");
        loca.setScale("20");
        loca.getMsgType();
        loca.showxml();





       /* FollowMessage fo=new FollowMessage(Followtype.scan);
        System.out.println(fo.getMsgType());
        System.out.println(fo.getEvent());
        System.out.println();

        CarteMessage ca=new CarteMessage("view");
        System.out.println(ca.getMsgType());
        System.out.println(ca.getEvent());
*/
    }
}

