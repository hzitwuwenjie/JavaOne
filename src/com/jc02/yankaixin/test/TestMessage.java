package com.jc02.yankaixin.test;

import com.jc02.yankaixin.message.*;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月25日 - 10:13
 * |  @description   测试消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {

    public static void main(String[] args) {
        TextMessage t = new TextMessage();
        System.out.println(t.getMsgType());
        ImageMessage i = new ImageMessage();
        System.out.println(i.getMsgType());
        VoiceMessage v = new VoiceMessage();
        System.out.println(v.getMsgType());
        VideoMessage vi = new VideoMessage(VideoType.video);
        System.out.println(vi.getMsgType());
        LocationMessage l = new LocationMessage();
        System.out.println(l.getMsgType());
        LinkMessage li = new LinkMessage();
        System.out.println(li.getMsgType());

        QrSceneMessage q = new QrSceneMessage(EventType.SCAN);
        System.out.println(q.getEvent());
        ReportLocationMessage r = new ReportLocationMessage();
        System.out.println(r.getEvent());
        ClickMessage cl = new ClickMessage(ClickType.click);
        System.out.println(cl.getEvent());
    }
}
