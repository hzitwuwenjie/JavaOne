package com.jc02.wjm.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:26
 * |  @description   小饰品
 * +---------------------------------Oooo---------------------------------------+
 */
public class ShoreVideoMessage extends Message {
    private String msgType;//	小视频为shortvideo
    private String mediaId;//	视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;//	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
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
