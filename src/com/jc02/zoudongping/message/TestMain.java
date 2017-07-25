package com.jc02.zoudongping.message;

import com.jc02.zoudongping.message.commonmessage.*;
import com.jc02.zoudongping.message.eventmessage.ClickMessage;
import com.jc02.zoudongping.message.eventmessage.ScanMessage;
import com.jc02.zoudongping.message.eventmessage.ScanType;
import com.jc02.zoudongping.message.eventmessage.UpPointMessage;
import com.jc02.zoudongping.message.commonmessage.UrlMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 10:00
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMain {
    public static void main(String[] args) {
        TextMessage tx=new TextMessage();
        System.out.println("消息类型:"+tx.getMsgtype());

        MediaMessage vi=new MediaMessage(VideoType.video);
        System.out.println("消息类型:"+vi.getMsgtype());
        MediaMessage svi=new MediaMessage(VideoType.shortvideo);
        System.out.println("消息类型:"+svi.getMsgtype());


        VoiceMessage vo=new VoiceMessage();
        System.out.println("消息类型:"+vo.getMsgtype());
        UrlMessage url=new UrlMessage();
        System.out.println("消息类型:"+url.getMsgtype());
        ImgMessage im=new ImgMessage();
        System.out.println("消息类型:"+im.getMsgtype());
        PointMessage loc=new PointMessage();
        System.out.println("消息类型:"+loc.getMsgtype());
        System.out.println("----------------------------------------------------------");
        //测试菜单事件
        ClickMessage cl=new ClickMessage();
        System.out.println("菜单事件的msgType值"+cl.getMsgtype());
        System.out.println("菜单事件的event值"+cl.getEvent());
        //上报地理位置事件
        UpPointMessage locationEventMessage=new UpPointMessage();
        System.out.println("地址事件的msgType:" + locationEventMessage.getMsgtype());
        System.out.println("地址事件的event:" + locationEventMessage.getEvent());
        //扫描带参数二维码事件
        ScanMessage q1=new ScanMessage(ScanType.SCAN);
        System.out.println("扫码事件的msgType:" + q1.getMsgtype());
        System.out.println("扫码事件的event:" + q1.getEvent());
        ScanMessage q2=new ScanMessage(ScanType.subscribe);
        System.out.println("订阅事件的msgType:" + q2.getMsgtype());
        System.out.println("订阅事件的event:" + q2.getEvent());
        ScanMessage q3=new ScanMessage(ScanType.unsubscribe);
        System.out.println("取消关注事件的msgType:" + q3.getMsgtype());
        System.out.println("取消关注事件的event:" + q3.getEvent());
    }
}