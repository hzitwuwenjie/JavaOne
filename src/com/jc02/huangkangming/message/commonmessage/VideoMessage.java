package com.jc02.huangkangming.message.commonmessage;

import com.jc02.huangkangming.message.type.VideoType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:20
 * |  @description   视频消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends CommonMessage {
    private String mediaId;
    private String thumbMediaId;

    public VideoMessage(VideoType msgType)
    {
        super(msgType.toString());
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]></MediaId>");
        System.out.println("<ThumbMediaId><![CDATA["+getThumbMediaId()+"]></ThumbMediaId>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]></MsgId>");
        System.out.println("</xml>");
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
}