package com.jc02.lwj.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 18:08
 * |    @description   语音消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends CommonMessage {
    private String mediaId;
    private String format;

    private String recognition;
    public VoiceMessage(){
        super("voice");
    }
    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
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
