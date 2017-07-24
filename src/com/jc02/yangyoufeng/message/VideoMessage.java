package com.jc02.yangyoufeng.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月24日 - 16:25
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends Message{
    private String msgId;//消息ID

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String mediaId;//	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    public String thumbMediaId;//	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

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