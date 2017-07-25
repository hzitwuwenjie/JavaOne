package com.jc02.lichenxi.message;
/**
 * Created by 李晨曦 2017年07月24日
 */
public class TestMessage {
    public static void main(String[] args) {
        TextMessage tx=new TextMessage();
        System.out.println("消息类型:"+tx.getMsgType());

        VideoMessage vi=new VideoMessage(VideoType.video);
        System.out.println("消息类型:"+vi.getMsgType());
        VideoMessage svi=new VideoMessage(VideoType.shortvideo);
        System.out.println("消息类型:"+svi.getMsgType());


        VoiceMessage vo=new VoiceMessage();
        System.out.println("消息类型:"+vo.getMsgType());
        LinkMessage url=new LinkMessage();
        System.out.println("消息类型:"+url.getMsgType());
        ImageMessage im=new ImageMessage();
        System.out.println("消息类型:"+im.getMsgType());
        LocationMessage loc=new LocationMessage();
        System.out.println("消息类型:"+loc.getMsgType());
        System.out.println("----------------------------------------------------------");
        //测试菜单事件
        ClickMessage cl=new ClickMessage();
        System.out.println("菜单事件的msgType值"+cl.getMsgType());
        System.out.println("菜单事件的event值"+cl.getEvent());
        //上报地理位置事件
        LocaEventMessage locationEventMessage=new LocaEventMessage();
        System.out.println("地址事件的msgType:" + locationEventMessage.getMsgType());
        System.out.println("地址事件的event:" + locationEventMessage.getEvent());
        //扫描带参数二维码事件
        QrsceneMessage q1=new QrsceneMessage(EventType.SCAN );
        System.out.println("扫码事件的msgType:" + q1.getMsgType());
        System.out.println("扫码事件的event:" + q1.getEvent());
        QrsceneMessage q2=new QrsceneMessage(EventType.subscribe);
        System.out.println("订阅事件的msgType:" + q2.getMsgType());
        System.out.println("订阅事件的event:" + q2.getEvent());
        QrsceneMessage q3=new QrsceneMessage(EventType.unsubscribe);
        System.out.println("取消关注事件的msgType:" + q3.getMsgType());
        System.out.println("取消关注事件的event:" + q3.getEvent());
    }
}
