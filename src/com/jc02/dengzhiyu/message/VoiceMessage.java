package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:15　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class VoiceMessage extends Message {
    private  String msgType;//	语音为voice
    private  String mediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private  String format;//	语音格式，如amr，speex等

    @Override
    public String getMsgType() {
        return msgType;
    }

    @Override
    public void setMsgType(String msgType) {
        msgType = msgType;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        format = format;
    }
}

