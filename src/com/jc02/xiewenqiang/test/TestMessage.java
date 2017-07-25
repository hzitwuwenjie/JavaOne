package com.jc02.xiewenqiang.test;

import com.jc02.xiewenqiang.message.commonmessage.*;
import com.jc02.xiewenqiang.message.eventmessage.LocationEventMessage;
import com.jc02.xiewenqiang.message.eventmessage.MenuEventMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月25日 - 10:05
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        ImageMessage imageMessage=new ImageMessage();
        System.out.println(imageMessage.getMsgType());

        LinkMessage linkMessage=new LinkMessage();
        System.out.println(linkMessage.getMsgType());

        locationMessage locationMessage =new locationMessage();
        System.out.println(locationMessage.getMsgType());

        TextMessage textMessage = new TextMessage();
        System.out.println(textMessage.getMsgType());

        VedioMessage vedioMessage= new VedioMessage("shortVedio");
        System.out.println(vedioMessage.getMsgType());

        VoiceMessage voiceMessage =new VoiceMessage();
        System.out.println(voiceMessage.getMsgType());

        LocationEventMessage locaEventMessage =new LocationEventMessage();
        System.out.println(locaEventMessage.getEvent());

        MenuEventMessage menuEventMessage=new MenuEventMessage("CLICK");
        System.out.println(menuEventMessage.getEvent());
    }
}
