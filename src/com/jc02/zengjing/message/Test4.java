package com.jc02.zengjing.message;

import com.jc02.fankelei.massage.VedioMessage;
import com.jc02.pengmeiqian.message.ImageCommonMessage;
import com.jc02.zengjing.message.commenmessage.ImageMessage;
import com.jc02.zengjing.message.commenmessage.VideoMessage;
import com.jc02.zengjing.message.commenmessage.VideoType;
import com.jc02.zengjing.message.eventmessage.DiyMessage;
import com.jc02.zengjing.message.eventmessage.DiyType;
import com.jc02.zengjing.message.eventmessage.EventType;
import com.jc02.zengjing.message.eventmessage.ScanMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月25日 - 10:28
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        ImageMessage i =new ImageMessage();
        System.out.println(i.getMsgType());
        VideoMessage v=new VideoMessage(VideoType.shortvideo);
        System.out.println(v.getMsgType());
        DiyMessage d=new DiyMessage(DiyType.clink);
        System.out.println(d.getMsgType());
        System.out.println(d.getEvent());
        ScanMessage s =new ScanMessage(EventType.scan);
        System.out.println(s.getMsgType());
        System.out.println(s.getEvent());

    }
}