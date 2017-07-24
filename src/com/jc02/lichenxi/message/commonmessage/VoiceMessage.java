package com.jc02.lichenxi.message.commonmessage;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class VoiceMessage extends SecMessage {
    private String MediaId;	//语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String Format;	//语音格式，如amr，speex等
    private String Recognition;	//语音识别结果，UTF8编码

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }
}
