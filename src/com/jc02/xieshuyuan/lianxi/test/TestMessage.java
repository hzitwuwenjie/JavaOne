package com.jc02.xieshuyuan.lianxi.test;

import com.jc02.pengmeiqian.message.ImageCommonMessage;
import com.jc02.xieshuyuan.lianxi.entity.message.commmessage.*;
import com.jc02.xieshuyuan.lianxi.entity.message.eventmessage.CustomMenuEventMessage;
import com.jc02.xieshuyuan.lianxi.entity.message.eventmessage.ReportLocationEventMessage;
import com.jc02.xieshuyuan.lianxi.entity.message.eventmessage.ScanningQrEventMessage;
import com.jc02.xiongzairen.message.ImgMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月25日 - 9:09
 * |    @description   测试消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        ImgMessage img=new ImgMessage();
        System.out.println("消息类型msgType值为："+img.getMsgType());

        LinkMessage link=new LinkMessage();
        System.out.println("消息类型msgType值为："+link.getMsgType());

        LocationMessage location=new LocationMessage();
        System.out.println("消息类型msgType值为："+location.getMsgType());

        ShortVideoMessage shortVideo=new ShortVideoMessage();
        System.out.println("消息类型msgType值为："+shortVideo.getMsgType());

        TextMassage text=new TextMassage();
        System.out.println("消息类型msgType值为："+text.getMsgType());

        VideoMessage video=new VideoMessage();
        System.out.println("消息类型msgType值为："+video.getMsgType());

        VoiceMessage voice=new VoiceMessage();
        System.out.println("消息类型msgType值为："+voice.getMsgType());

        CustomMenuEventMessage customMenuEvent=new CustomMenuEventMessage();
        System.out.println("消息类型msgType值为："+customMenuEvent.getMsgType());
        System.out.println("事件类型event值为："+customMenuEvent.getEvent());

        ReportLocationEventMessage reportLocationEvent=new ReportLocationEventMessage();
        System.out.println("消息类型msgType值为："+reportLocationEvent.getMsgType());
        System.out.println("事件类型event值为："+reportLocationEvent.getEvent());

        ScanningQrEventMessage scanningQrEvent=new ScanningQrEventMessage();
        System.out.println("消息类型msgType值为："+scanningQrEvent.getMsgType());
        System.out.println("事件类型event值为："+scanningQrEvent.getEvent());
    }
}
