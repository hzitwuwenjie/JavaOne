package com.jc02.wjm.test;

import com.jc02.wjm.message.*;
import com.jc02.wjm.message.commonmessage.*;
import com.jc02.wjm.message.eventmessage.Click;
import com.jc02.wjm.message.eventmessage.LocationEventMessage;
import com.jc02.wjm.message.eventmessage.Qrscene2;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 9:57
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        TextMessage tx=new TextMessage();
        System.out.println("消息类型:"+tx.getMsgType());

        VideoMessage vi=new VideoMessage(VideoType.video);
        System.out.println("消息类型:"+vi.getMsgType());
        VideoMessage svi=new VideoMessage(VideoType.shortvideo);
        System.out.println("消息类型:"+svi.getMsgType());


        VoiceMessage vo=new VoiceMessage();
        System.out.println("消息类型:"+vo.getMsgType());
        UrlMessage url=new UrlMessage();
        System.out.println("消息类型 :"+url.getMsgType());
        ImageMessage im=new ImageMessage();
        System.out.println("消息类型:"+im.getMsgType());
        LocationMessage loc=new LocationMessage();
        System.out.println("消息类型:"+loc.getMsgType());
        System.out.println("----------------------------------------------------------");
        //测试菜单事件
        Click cl=new Click();
        System.out.println("菜单事件的msgType值"+cl.getMsgType());
        System.out.println("菜单事件的event值"+cl.getEvent());
        //上报地理位置事件
        LocationEventMessage locationEventMessage=new LocationEventMessage();
        System.out.println("地址事件的msgType:" + locationEventMessage.getMsgType());
        System.out.println("地址事件的event:" + locationEventMessage.getEvent());
        //扫描带参数二维码事件
        Qrscene2 q1=new Qrscene2(EventType.SCAN );
        System.out.println("扫码事件的msgType:" + q1.getMsgType());
        System.out.println("扫码事件的event:" + q1.getEvent());
        Qrscene2 q2=new Qrscene2(EventType.subscribe);
        System.out.println("订阅事件的msgType:" + q2.getMsgType());
        System.out.println("订阅事件的event:" + q2.getEvent());
        Qrscene2 q3=new Qrscene2(EventType.unsubscribe);
        System.out.println("取消关注事件的msgType:" + q3.getMsgType());
        System.out.println("取消关注事件的event:" + q3.getEvent());
    }
}
