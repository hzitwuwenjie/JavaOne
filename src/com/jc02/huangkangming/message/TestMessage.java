package com.jc02.huangkangming.message;

import com.jc02.huangkangming.message.commonmessage.*;
import com.jc02.huangkangming.message.eventmessage.FollowEventMessage;
import com.jc02.huangkangming.message.eventmessage.LocationEventMessage;
import com.jc02.huangkangming.message.eventmessage.MenuEventMessage;
import com.jc02.huangkangming.message.eventmessage.ScanEventMessage;
import com.jc02.huangkangming.message.type.FollowEventType;
import com.jc02.huangkangming.message.type.MenuEventType;
import com.jc02.huangkangming.message.type.ScanEventType;
import com.jc02.huangkangming.message.type.VideoType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 9:41
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        TextMessage tm=new TextMessage();
        System.out.println(tm.getMsgType());


        PicMessage pm=new PicMessage();
        System.out.println(pm.getMsgType());

        VoiceMessage vm=new VoiceMessage();
        System.out.println(vm.getMsgType());

        VideoMessage vm1=new VideoMessage(VideoType.shortvideo);
        System.out.println(vm1.getMsgType());

        VideoMessage vm2=new VideoMessage(VideoType.video);
        System.out.println(vm2.getMsgType());

        LocationMessage lm=new LocationMessage();
        System.out.println(lm.getMsgType());

        LinkMessage lm1=new LinkMessage();
        System.out.println(lm1.getMsgType());

        LocationEventMessage lem=new LocationEventMessage();
        System.out.println(lem.getMsgType());
        System.out.println(lem.getEvent());

        MenuEventMessage mem=new MenuEventMessage(MenuEventType.VIEW);
        System.out.println(mem.getMsgType());
        System.out.println(mem.getEvent());

        MenuEventMessage mem1=new MenuEventMessage(MenuEventType.CLICK);
        System.out.println(mem1.getMsgType());
        System.out.println(mem1.getEvent());


        ScanEventMessage sem=new ScanEventMessage(ScanEventType.SCAN);
        System.out.println(sem.getMsgType());
        System.out.println(sem.getEvent());

        ScanEventMessage sem1=new ScanEventMessage(ScanEventType.subscribe);
        System.out.println(sem1.getMsgType());
        System.out.println(sem1.getEvent());

        FollowEventMessage fem=new FollowEventMessage(FollowEventType.subscribe);
        System.out.println(fem.getMsgType());
        System.out.println(fem.getEvent());

        FollowEventMessage fem1=new FollowEventMessage(FollowEventType.unsubscribe);
        System.out.println(fem1.getMsgType());
        System.out.println(fem1.getEvent());
    }
}