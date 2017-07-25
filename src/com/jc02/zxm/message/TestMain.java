package com.jc02.zxm.message;

import com.jc02.zxm.message.event.LocationEvent;
import com.jc02.zxm.message.event.MenuEvent;
import com.jc02.zxm.message.event.QrcodeEvent;
import com.jc02.zxm.message.event.QrcodeType;
import com.jc02.zxm.message.messageType.*;

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
        TextMessage text=new TextMessage();
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

         EventMessage ev=new EventMessage("event");
         System.out.println(ev.getMsgType());
        MenuEvent me=new MenuEvent();
        System.out.println("菜单点击事件事件类型："+me.getEvent());
        System.out.println("菜单点击事件消息类型："+me.getMsgType());
        LocationEvent lom=new LocationEvent();
        System.out.println("地理点击事件事件类型：" + lom.getEvent());
        System.out.println("地理点击事件消息类型：" + lom.getMsgType());
        QrcodeEvent qrcodeEvent=new QrcodeEvent(QrcodeType.SCAN);
        System.out.println("扫码点击事件事件类型：" + qrcodeEvent.getEvent());
        System.out.println("扫码点击事件消息类型：" + qrcodeEvent.getMsgType());



    }
}


