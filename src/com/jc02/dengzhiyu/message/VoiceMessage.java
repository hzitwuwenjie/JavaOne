package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:15　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.UUID;

public class VoiceMessage extends CommonMessage {
    private  String mediaId;//	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private  String format;//	语音格式，如amr，speex等
    public VoiceMessage(){
        super("Voice");
    }

    public void showxml(){
        System.out.println("<xml>");
        System.out.println(" <ToUserName>"+getToUserName()+" </ToUserName>");
        System.out.println(" <FromUserName>"+getFromUserName()+" </ToUserName>");
        System.out.println("<CreateTime>"+ System.currentTimeMillis()+" </CreateTime>");
        System.out.println(" <MediaId>"+ getMediaId()+" </MediaId>");
        System.out.println(" <Format>"+ getFormat()+" </Format>");
        System.out.println(" <MagType>"+ getMsgType()+" </MagType>");
        System.out.println(" <MsgId>"+ UUID.randomUUID()+" </MsgId>");
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

