package com.jc02.qinjiajun.message.test;
import com.jc02.qinjiajun.message.message.*;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月25日 - 9:52
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test {
    public static void main(String[] args) {
/*
        ImgMessage i = new ImgMessage();
        System.out.println(i.getMsgType());
        ItemEventMessage it = new ItemEventMessage();
        System.out.println(it.getEvent());
        LinkMessage l =new LinkMessage();
        System.out.println(l.getMsgType());
        LocationMessage lo = new LocationMessage();
        System.out.println(lo.getMsgType());
        QrEventMessage qw = new QrEventMessage();
        System.out.println(qw.getEvent());
        TextMassage te = new TextMassage();
        System.out.println(te.getMsgType());
        UpLocationEventMessage  up= new  UpLocationEventMessage();
        System.out.println(up.getEvent());
        VideoMessage vi = new VideoMessage();
        System.out.println(vi.getMsgType());
        VoiceMessage vo = new VoiceMessage();
        System.out.println(vo.getMsgType());
*/


        TextMassage me = new TextMassage();
        me.ShowXml(me);
    }
}