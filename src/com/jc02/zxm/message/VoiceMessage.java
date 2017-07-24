package com.jc02.zxm.message;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月24日 - 16:20　                           |
 * |    @description   语音消息　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class VoiceMessage extends  Message{

    private String mediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String format;//	语音格式，如amr，speex等
    private  String recognition;
    private String msgId;//	消息id，64位整型

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
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

