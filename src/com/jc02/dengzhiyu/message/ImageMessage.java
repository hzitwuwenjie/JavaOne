package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:14　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class ImageMessage extends CommonMessage {
    private String picUrl;//	图片链接（由系统生成）
    private String mediaId;//	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        mediaId = mediaId;
    }
}

