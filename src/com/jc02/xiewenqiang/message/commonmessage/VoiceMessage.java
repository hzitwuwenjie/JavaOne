package com.jc02.xiewenqiang.message.commonmessage;

import com.jc02.xiewenqiang.message.Message;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:19
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends Message {
    private String mediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String format;//	语音格式，如amr，speex等

    public VoiceMessage() {
        super("voice");
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA[" + getToUserName() + "]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA[" + getFromUserName() + "]]></FromUserName>");
        System.out.println("\t<CreateTime>" + getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType><![CDATA[" + getMsgType() + "]]></MsgType>");
        System.out.println("\t<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println("\t<Format><![CDATA["+getFormat()+"]]></Format>");
        System.out.println("</xml>");
    }
}
