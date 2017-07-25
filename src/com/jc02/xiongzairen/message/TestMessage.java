package com.jc02.xiongzairen.message;

import com.jc02.dengzhiyu.message.*;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 9:55
 * |    @description   测试Message
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        TextMessage t=new TextMessage();
        System.out.println(t.getMsgType());
        VideoMessage vd=new VideoMessage("video");
        System.out.println(vd.getMsgType());
        VoiceMessage vi=new VoiceMessage();
        System.out.println(vi.getMsgType());
        ImgMessage ig=new ImgMessage();
        System.out.println(ig.getMsgType());
        LinkMessage lk=new LinkMessage();
        System.out.println(lk.getMsgType());
        PositionMessage p=new PositionMessage();
        System.out.println(p.getMsgType());



    }


}
