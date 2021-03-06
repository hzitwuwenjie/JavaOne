package com.jc02.xiewenqiang.message.commonmessage;

import com.jc02.xiewenqiang.message.CommonMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:22
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VedioMessage extends CommonMessage {
    private String mediaId;//	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;//	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

    public VedioMessage(String type) {
        super(type);
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId ) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public void showXml() {
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA[" + getToUserName() + "]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA[" + getFromUserName() + "]]></FromUserName>");
        System.out.println("\t<CreateTime>" + getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType><![CDATA[" + getMsgType() + "]]></MsgType>");
        System.out.println("\t<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println("\t <ThumbMediaId><![CDATA["+getThumbMediaId()+"]]></ThumbMediaId>");
        System.out.println("\t<MsgId>" + getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}
