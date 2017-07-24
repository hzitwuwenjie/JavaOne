package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:17　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class VideoMessage extends CommonMessage {
    private  String mediaId;//	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;//	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        thumbMediaId = thumbMediaId;
    }
}

