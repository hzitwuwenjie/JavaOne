package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class ImageMessage extends CommonMessage {
    private String picUrl;	//图片链接（由系统生成）
    private String mediaId;	//图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    public ImageMessage(String msgType) {
        super(msgType);
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
}
