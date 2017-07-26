package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:21
 * |  @description   语音消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends CommonMessage {

    private int mediaId;
    private String format;
    private String recognition;

    public VoiceMessage(){
        super("voice");
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<MediaId>" + this.getMediaId() + "</MediaId>");
        System.out.println("\t<Format>" + this.getFormat() + "</Format>");
        System.out.println("\t<MsgId>" + this.getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}
