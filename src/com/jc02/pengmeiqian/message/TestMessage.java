package com.jc02.pengmeiqian.message;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月25日 - 9:57
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        TextCommonMessage text = new TextCommonMessage();
        System.out.println(text.getMsgType());

        ImageCommonMessage img = new ImageCommonMessage();
        System.out.println(img.getMsgType());

        LinkCommonMessage link = new LinkCommonMessage();
        System.out.println(link.getMsgType());

        LocationCommonMessage lo = new LocationCommonMessage();
        System.out.println(lo.getMsgType());

        VoiceCommonMessage voice = new VoiceCommonMessage();
        System.out.println(voice.getMsgType());

        VideoCommonMessage video = new VideoCommonMessage("video");
        System.out.println(video.getMsgType());

        LocationEventMessage locationEventMessage = new LocationEventMessage();
        System.out.println(locationEventMessage.getEvent());

        MenuEventMessage menuEventMessage = new MenuEventMessage("click");
        System.out.println(menuEventMessage.getEvent());

        SubscribeEventMessage subscribeEventMessage = new SubscribeEventMessage("scan");
        System.out.println(subscribeEventMessage.getEvent());
    }
}
