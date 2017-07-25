package com.jc02.zengjing.message.commenmessage;

import com.jc02.zengjing.message.ComMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:17
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImageMessage extends ComMessage {
    private String picUrl;
    private String mediaId;

    public ImageMessage() {
        super("image");
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String toString(){
        return getFromUserName()+"发送了一条图片信息给"+getToUserName()+"图片地址是："+getPicUrl();
    }

    public  void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<PicUrl><![CDATA["+getPicUrl()+"]]></PicUrl>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
        System.out.println("</xml>");
    }
}