package com.jc02.huangkangming.message.commonmessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:14
 * |  @description   图片信息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class PicMessage extends CommonMessage {
    private String picURL;
    private String mediaId;

    public PicMessage() {
        super("image");
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<PicUrl><![CDATA["+getPicURL()+"]></PicUrl>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]></MediaId>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]></MsgId>");
        System.out.println("</xml>");
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }
}