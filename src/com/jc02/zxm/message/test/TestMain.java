package com.jc02.zxm.message.test;

import com.jc02.zxm.message.event.LocationEvent;
import com.jc02.zxm.message.event.MenuEvent;
import com.jc02.zxm.message.event.QrcodeEvent;
import com.jc02.zxm.message.event.QrcodeType;
import com.jc02.zxm.message.message.*;

import java.util.UUID;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月25日 - 10:14　                           |
 * |    @description   测试消息类　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class TestMain {
    public static void main(String[] args) {
       /* TextMessage text=new TextMessage();
        System.out.println(text.getMsgType());
        LocationMessage lo=new LocationMessage();
        System.out.println(lo.getMsgType());
        PicMessage pic=new PicMessage();
        System.out.println(pic.getMsgType());
        UrlMessage url=new UrlMessage();
        System.out.println(url.getMsgType());
        VideoMessage vid=new VideoMessage(VideoType.shortVideo);
        System.out.println(vid.getMsgType());
        VideoMessage videoMessage=new VideoMessage(VideoType.video);
        System.out.println(videoMessage.getMsgType());
        VoiceMessage vo=new VoiceMessage();
        System.out.println(vo.getMsgType());


        MenuEvent me=new MenuEvent();
        System.out.println("菜单点击事件事件类型："+me.getEvent());
        System.out.println("菜单点击事件消息类型："+me.getMsgType());
        LocationEvent lom=new LocationEvent();
        System.out.println("地理点击事件事件类型：" + lom.getEvent());
        System.out.println("地理点击事件消息类型：" + lom.getMsgType());
        QrcodeEvent qrcodeEvent=new QrcodeEvent(QrcodeType.SCAN);
        System.out.println("扫码点击事件事件类型：" + qrcodeEvent.getEvent());
        System.out.println("扫码点击事件消息类型：" + qrcodeEvent.getMsgType());
*/
        TextMessage textMessage=new TextMessage();
        textMessage.setFromUserName("曾宪明");
        textMessage.setToUserName("李文俊");
        textMessage.setContent("今晚一起去打撸！");
        textMessage.setCreateTime(System.currentTimeMillis());
        textMessage.setMsgId(UUID.randomUUID().toString());
        System.out.println(textMessage.toString());

        PicMessage picMessage=new PicMessage();
        picMessage.setFromUserName("李文俊");
        picMessage.setToUserName("曾宪明");
        picMessage.setPicUrl("http://www.cnblogs.com/100thMountain/p/5402004.html");
        System.out.println(picMessage.toString());



    }
}


