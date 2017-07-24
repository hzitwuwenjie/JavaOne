package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:15　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class VoiceMessage extends CommonMessage {
    private  String mediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private  String format;//	语音格式，如amr，speex等


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

