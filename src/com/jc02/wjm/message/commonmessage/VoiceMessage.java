package com.jc02.wjm.message.commonmessage;

import com.jc02.wjm.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:19
 * |  @description   语音消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends CommonMessage {
    private  String mediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private  String format;//	语音格式，如amr，speex等

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
    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]</ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]</FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]</MsgType>");
        System.out.println("<Format><![CDATA["+getFormat()+"]]</Format>");
        System.out.println("<MsgId>"+getMsgId()+"</MsgId>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]]</MediaId>>");
        System.out.println("</xml>");
    }
}
