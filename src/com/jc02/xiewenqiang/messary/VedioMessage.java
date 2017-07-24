package com.jc02.xiewenqiang.messary;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:22
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VedioMessage extends Message {
    private String mediaId;//	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;//	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private long msgId;//	消息id，64位整型

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
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
