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
        System.out.println("...................文本消息..................");
        text.setFromUserName("熊再仁");
        text.setToUserName("黄康明");
        text.setContent("yh你好！");
        text.setCreateTime(System.currentTimeMillis());
        text.setMsgId("");

        VideoMessage vd=new VideoMessage(VideoType.video);
        System.out.println("...................视频消息..................");
        vd.setToUserName("熊再仁");
        vd.setFromUserName("hkm");
        vd.setCreateTime(System.currentTimeMillis());
        vd.setMediaId(1);
        vd.setThumbMediaId("你好");
        vd.setMsgId("");

        ImgMessage ig=new ImgMessage();
        System.out.println("...................图片消息..................");
        ig.setToUserName("xzr");
        ig.setFromUserName("yh");
        ig.setCreateTime(System.currentTimeMillis());
        ig.setPicUrl("http://www.baidu.com/baidu.gif");
        ig.setMediaId(1);
        ig.setMsgId("");

        VoiceMessage vi=new VoiceMessage();
        System.out.println("...................语音消息..................");
        vi.setToUserName("熊再仁");
        vi.setFromUserName("hkm");
        vi.setCreateTime(System.currentTimeMillis());
        vi.setMediaId(1);
        vi.setFormat("arm");
        vi.setMsgId("");

        PositionMessage ps=new PositionMessage();
        System.out.println("...................文本消息..................");
        ps.setToUserName("熊再仁");
        ps.setFromUserName("hkm");
        ps.setCreateTime(System.currentTimeMillis());
        ps.setLocation_X(8);
        ps.setLocation_Y(9);
        ps.setScale("1");
        ps.setLabel("江西省");
        vi.setMsgId("");

        LinkMessage lk=new LinkMessage();
        System.out.println("...................链接消息..................");
        lk.setToUserName("熊再仁");
        lk.setFromUserName("hkm");
        lk.setCreateTime(System.currentTimeMillis());
        lk.setTitle("标题");
        lk.setDescription("没有");
        lk.setUrl("http://www.baidu.com");
        lk.setMsgId("");



    }

}
