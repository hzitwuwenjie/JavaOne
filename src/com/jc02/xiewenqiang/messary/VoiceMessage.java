package com.jc02.xiewenqiang.messary;

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
    private String recognition;//	语音识别结果，UTF8编码

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

    public String getRecognition() {
        return recognition ;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }
}
