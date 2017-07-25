package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:14　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.UUID;

public class ImageMessage extends CommonMessage {
    private String picUrl;//	图片链接（由系统生成）
    private String mediaId;//	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    public ImageMessage() {
        super("Image");
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public void showxml() {
        System.out.println("<xml>");
        System.out.println(" <ToUserName>"+getToUserName()+" </ToUserName>");
        System.out.println(" <FromUserName>"+getFromUserName()+" </ToUserName>");
        System.out.println(" <CreateTime>"+ System.currentTimeMillis()+" </CreateTime>");
        System.out.println("<PicUrl>"+ getPicUrl()+" </PicUrl>");
        System.out.println("<MediaId>"+ getMediaId()+" </MediaId>");
        System.out.println(" <MagType>"+ getMsgType()+" </MagType>");
        System.out.println(" <MsgId>"+ UUID.randomUUID()+" </MsgId>");
        System.out.println("</xml>");


    }
}

