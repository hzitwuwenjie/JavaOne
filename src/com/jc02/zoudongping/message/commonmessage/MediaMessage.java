package com.jc02.zoudongping.message.commonmessage;

import com.jc02.zoudongping.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:25
 * |    @description   视频消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class MediaMessage extends CommonMessage {
    private String mediaid;
    private String thumbmediaid;


    public MediaMessage(VideoType msgType) {
        super(msgType.toString());
    }


    public String getThumbmediaid() {
        return thumbmediaid;
    }

    public void setThumbmediaid(String thumbmediaid) {
        this.thumbmediaid = thumbmediaid;
    }

    public String getMediaid() {
        return mediaid;
    }

    public void setMediaid(String mediaid) {
        this.mediaid = mediaid;
    }
    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<ThumbMediaId><![CDATA["+getThumbmediaid()+"]]></ThumbMediaId>");
        System.out.println("\t<MediaId>"+getMediaid()+"</MediaId>");
        System.out.println("\t<MsgId>"+getMsgid()+"</MsgId>");
        System.out.println("</xml>");
    }
}