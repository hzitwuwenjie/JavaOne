package com.jc02.huangkangming.message.commonmessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:17
 * |  @description   语音消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends CommonMessage {
    private String mediaId;
    private String format;

    public VoiceMessage() {
        super("voice");
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<MediaId><![CDATA["+getMediaId()+"]></MediaId>");
        System.out.println("<Format><![CDATA["+getFormat()+"]></Format>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]></MsgId>");
        System.out.println("</xml>");
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
}