package com.jc02.wjm.message.commonmessage;

import com.jc02.wjm.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:17
 * |  @description   图片消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImageMessage extends CommonMessage {

    private String picUrl;//	图片链接（由系统生成）
    private String mediaId;//	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

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

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]</ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]</FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]</MsgType>");
        System.out.println("<PicUrl><![CDATA["+getPicUrl()+"]]</PicUrl>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]]</MsgId>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]]</MediaId>>");
        System.out.println("</xml>");

    }
}
