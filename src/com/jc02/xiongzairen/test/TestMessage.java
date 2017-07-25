package com.jc02.xiongzairen.test;



import com.jc02.xiongzairen.message.*;

/**
 * 　　  　  　    可
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 10:40
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        TextMessage tm=new TextMessage();
        System.out.println(tm.getMsgType());


        ImgMessage im=new ImgMessage();
        System.out.println(im.getMsgType());

        VoiceMessage vm=new VoiceMessage();
        System.out.println(vm.getMsgType());

        VideoMessage vm1=new VideoMessage(VideoType.shortvideo);
        System.out.println(vm1.getMsgType());

        VideoMessage vm2=new VideoMessage(VideoType.video);
        System.out.println(vm2.getMsgType());

        PositionMessage lm=new PositionMessage();
        System.out.println(lm.getMsgType());

        LinkMessage lm1=new LinkMessage();
        System.out.println(lm1.getMsgType());

        PrecisionMessage lem=new PrecisionMessage();
        System.out.println(lem.getMsgType());
        System.out.println(lem.getEvent());

        CustomMessage mem=new CustomMessage(CustomEvent.CLICK);
        System.out.println(mem.getMsgType());
        System.out.println(mem.getEvent());

        CustomMessage mem1=new CustomMessage(CustomEvent.VIEW);
        System.out.println(mem1.getMsgType());
        System.out.println(mem1.getEvent());


        QrCodeMessage sem=new QrCodeMessage(EventType.SCAN);
        System.out.println(sem.getMsgType());
        System.out.println(sem.getEvent());

        QrCodeMessage qr1=new QrCodeMessage(EventType.subsctibe);
        System.out.println(qr1.getMsgType());
        System.out.println(qr1.getEvent());
        QrCodeMessage qr2=new QrCodeMessage(EventType.unsubsctibe);
        System.out.println(qr2.getMsgType());
        System.out.println(qr2.getEvent());
    }
}
