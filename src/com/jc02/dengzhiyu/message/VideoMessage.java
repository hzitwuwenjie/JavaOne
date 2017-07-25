package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:17　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.UUID;

public class VideoMessage extends CommonMessage {
    private  String mediaId;//	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;//	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    public VideoMessage( VideoType msgtype){
        super(msgtype.toString());
    }
    public void showxml(){
        System.out.println("<xml>");
        System.out.println(" <ToUserName>"+getToUserName()+" </ToUserName>");
        System.out.println(" <FromUserName>"+getFromUserName()+" </ToUserName>");
        System.out.println(" <CreateTime>"+ System.currentTimeMillis()+" </CreateTime>");
        System.out.println(" <ThumbMediaId>"+getThumbMediaId()+" </ThumbMediaId>");
        System.out.println(" <MediaId>"+getMediaId()+" </MediaId>");
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

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }
}

