package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月25日 - 10:04　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class test {
    public static void main(String[] args) {
        TextMessage te=new TextMessage();
        System.out.println(te.getMsgType());
        System.out.println();

        ImageMessage im=new ImageMessage();
        System.out.println(im.getMsgType());
        System.out.println();

        VideoMessage vi=new VideoMessage("shortvideo");
        System.out.println(vi.getMsgType());
        System.out.println();

        VoiceMessage vo=new VoiceMessage();
        System.out.println(vo.getMsgType());
        System.out.println();

        LinkMessage li=new LinkMessage();
        System.out.println(li.getMsgType());
        System.out.println();

        LocationMessage loca=new LocationMessage();
        System.out.println(loca.getMsgType());
        System.out.println();

        LocaEventMessage loc=new LocaEventMessage();
        System.out.println(loc.getMsgType());
        System.out.println(loc.getEvent());
        System.out.println();



        FollowMessage fo=new FollowMessage("subcribe");
        System.out.println(fo.getMsgType());
        System.out.println(fo.getEvent());
        System.out.println();

        CarteMessage ca=new CarteMessage("view");
        System.out.println(ca.getMsgType());
        System.out.println(ca.getEvent());
//
    }
}

