package com.jc02.wjm.test;

import com.jc02.weiyilun.entity.commonmessage.Voice;
import com.jc02.wjm.message.VideoType;
import com.jc02.wjm.message.commonmessage.ImageMessage;
import com.jc02.wjm.message.commonmessage.TextMessage;
import com.jc02.wjm.message.commonmessage.VideoMessage;
import com.jc02.wjm.message.commonmessage.VoiceMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 14:50
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage2 {
    public static void main(String[] args) {
        TextMessage tx = new TextMessage();
        tx.setToUserName("万家明");
        tx.setFromUserName("范珂磊");
        tx.setCreateTime(System.currentTimeMillis());
        tx.setContent("吃点东西");
        System.out.println("=============文本消息================");
        tx.showXml();
        System.out.println("====================================");
        ImageMessage im = new ImageMessage();
        im.setToUserName("小碗");
        im.setFromUserName("小范");
        im.setCreateTime(System.currentTimeMillis());
        im.setPicUrl("www.baidu.com");
        im.setMediaId("10086");
        System.out.println("=============图片消息================");
        im.showXml();
        System.out.println("====================================");
        VoiceMessage vo=new VoiceMessage();
        vo.setToUserName("小万");
        vo.setFromUserName("小曾");
        vo.setCreateTime(System.currentTimeMillis());
        vo.setFormat("amr");
        vo.setMediaId("10010");
        System.out.println("=============语音消息================");
        vo.showXml();
        System.out.println("====================================");
        VideoMessage vi=new VideoMessage(VideoType.shortvideo);
        vi.setToUserName("小万");
        vi.setFromUserName("小魏");
        vi.setCreateTime(System.currentTimeMillis());
        vi.setThumbMediaId("120");
        vi.setMediaId("10010");
        System.out.println("=============视频消息================");
        vi.showXml();
        System.out.println("====================================");

    }
}