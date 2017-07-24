package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:26
 * |  @description   视频消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends Message{

    private long msgId;
    private int mediaId;
    private int thumbMediaId;

    public VideoMessage(long msgId, int mediaId, int thumbMediaId) {
        this.msgId = msgId;
        this.mediaId = mediaId;
        this.thumbMediaId = thumbMediaId;
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public int getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(int thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }
}
