package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:17
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends CommonMessage {

    private long mediaId;
    private String format;

    public VoiceMessage() {
        super("voice");
    }
    public void showxml(){
        System.out.println("<xml>");

        System.out.println("<toUserName><![CDATA["+getToUserName()+"]]></toUserName>");
        System.out.println("<toFromUserName><![CDATA["+getFromUserName()+"]]></toFromUserName>");
        System.out.println("<toContent><![CDATA["+getMediaId()+"]]><toContent>");
        System.out.println("<toCreateTime><![CDATA["+getCreateTime()+")]]><toCreateTime>");
        System.out.println("<toMsgType><![CDATA["+getMsgType()+"]]></toMsgType>");
        System.out.println("<toFormat><![CDATA["+getFormat()+")]]></toFormat>");
        System.out.println("<toMsgId><![CDATA["+getMsgId()+")]]></toMsgId>");
        System.out.println("</xml>");
    }



    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getMediaId() {
        return mediaId;
    }

    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
    }




}
