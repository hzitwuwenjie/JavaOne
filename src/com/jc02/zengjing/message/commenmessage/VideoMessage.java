package com.jc02.zengjing.message.commenmessage;

import com.jc02.zengjing.message.ComMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:25
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends ComMessage {
    private String mediaId;
    private String thumbMediaId;

    public VideoMessage(VideoType msgType) {
        super(msgType.toString());
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }
    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println("<ThumbMediaId><![CDATA["+getThumbMediaId()+"]]></ThumbMediaId>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
        System.out.println("</xml>");
    }
}