package com.jc02.xiongzairen.test;

import com.jc02.xiongzairen.message.*;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 14:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMsg2 {
    public static void main(String[] args) {
        TextMessage text=new TextMessage();
        text.setFromUserName("熊再仁");
        text.setToUserName("黄康明");
        text.setContent("yh你好！");
        text.setCreateTime(System.currentTimeMillis());
        text.setMsgId("");

        VideoMessage vd=new VideoMessage(VideoType.video);
        vd.setToUserName("熊再仁");
        vd.setFromUserName("hkm");
        vd.setCreateTime(System.currentTimeMillis());
        vd.setMediaId(1);
        vd.setThumbMediaId("你好");
        vd.setMsgId("");

        ImgMessage ig=new ImgMessage();
        ig.setToUserName("xzr");
        ig.setFromUserName("yh");
        ig.setCreateTime(System.currentTimeMillis());
        ig.setPicUrl("http://www.baidu.com/baidu.gif");
        ig.setMediaId(1);
        ig.setMsgId("");

        VoiceMessage vi=new VoiceMessage();
        vi.setToUserName("熊再仁");
        vi.setFromUserName("hkm");
        vi.setCreateTime(System.currentTimeMillis());
        vi.setMediaId(1);
        vi.setFormat("arm");
        vi.setMsgId("");






    }

}
