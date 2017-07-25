package com.jc02.zengjing.message;

import com.jc02.fankelei.massage.VedioMessage;
import com.jc02.pengmeiqian.message.ImageCommonMessage;
import com.jc02.zengjing.message.commenmessage.ImageMessage;
import com.jc02.zengjing.message.commenmessage.VideoMessage;
import com.jc02.zengjing.message.eventmessage.DiyMessage;

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
        VideoMessage v=new VideoMessage("video");
        System.out.println(v.getMsgType());
        DiyMessage d=new DiyMessage("clink");
        System.out.println(d.getMsgType());
        System.out.println(d.getEvent());

    }
}