package com.jc02.lichenxi.message.commonmessage;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class VideoMessage extends SecMessage {
    private String MediaId;	//视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String ThumbMediaId;	//视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
