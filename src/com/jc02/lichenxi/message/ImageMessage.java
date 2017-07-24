package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class ImageMessage extends CommonMessage {
    private String PicUrl;	//图片链接（由系统生成）
    private String MediaId;	//图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
