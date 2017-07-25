package com.jc02.xieshuyuan.lianxi.test;

import com.jc02.xieshuyuan.lianxi.entity.message.Message;
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
 * |　@create 2017年07月25日 - 14:00
 * |    @description   业务对象调用
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMsg {
    public static void main(String[] args) {
        //父类的引用，指向子类的对象
        //Message msg=new ImageMessage();
        //msg就代表了父类的引用。在编码阶段msg都代表父类，在执行阶段代表子类对象
        //如果需要强制调用子类的方法。我们可以强制类型转换
        //((ImageMessage)msg).toString();

        ImageMessage img=new ImageMessage();
        img.setToUserName("谢树源1");
        img.setFromUserName("美女");
        img.setPicUrl("http://img1.gtimg.com/ninja/1/2017/07/ninja150012654723524.jpg");
        img.setMediaId("123456");
        img.setMsgId(1);
        img.setCreateTime(System.currentTimeMillis());
        img.showXml();

        LinkMessage link=new LinkMessage();
        link.setToUserName("谢树源2");
        link.setFromUserName("美女");
        link.setCreateTime(System.currentTimeMillis());
        link.showXml();

        LocationMessage location=new LocationMessage();
        location.setToUserName("谢树源3");
        location.setFromUserName("美女");
        location.setCreateTime(System.currentTimeMillis());
        location.showXml();

        ShortVideoMessage shortVideo=new ShortVideoMessage();
        shortVideo.setToUserName("谢树源4");
        shortVideo.setFromUserName("美女");
        shortVideo.setCreateTime(System.currentTimeMillis());
        shortVideo.showXml();

        TextMassage text=new TextMassage();
        text.setToUserName("谢树源5");
        text.setFromUserName("美女");
        text.setCreateTime(System.currentTimeMillis());
        text.showXml();

        VideoMessage video=new VideoMessage();
        video.setToUserName("谢树源6");
        video.setFromUserName("美女");
        video.setCreateTime(System.currentTimeMillis());
        video.showXml();

        VoiceMessage voice=new VoiceMessage();
        voice.setToUserName("谢树源7");
        voice.setFromUserName("美女");
        voice.setCreateTime(System.currentTimeMillis());
        voice.showXml();

        CustomMenuEventMessage customMenuEvent=new CustomMenuEventMessage();
        customMenuEvent.setToUserName("谢树源8");
        customMenuEvent.setFromUserName("美女");
        customMenuEvent.setCreateTime(System.currentTimeMillis());
        customMenuEvent.showXml();

        ReportLocationEventMessage reportLocationEvent=new ReportLocationEventMessage();
        reportLocationEvent.setToUserName("谢树源9");
        reportLocationEvent.setFromUserName("美女");
        reportLocationEvent.setCreateTime(System.currentTimeMillis());
        reportLocationEvent.showXml();

        ScanningQrEventMessage scanningQrEvent=new ScanningQrEventMessage();
        scanningQrEvent.setToUserName("谢树源10");
        scanningQrEvent.setFromUserName("美女");
        scanningQrEvent.setCreateTime(System.currentTimeMillis());
        scanningQrEvent.showXml();
    }
}
