package com.jc02.huangkangming.message;

import com.jc02.huangkangming.message.commonmessage.*;

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

        VideoMessage vm1=new VideoMessage("video");
        System.out.println(vm1.getMsgType());

        VideoMessage vm2=new VideoMessage("shortvideo");
        System.out.println(vm2.getMsgType());

        LocationMessage lm=new LocationMessage();
        System.out.println(lm.getMsgType());

        LinkMessage lm1=new LinkMessage();
        System.out.println(lm1.getMsgType());
    }
}