package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 16:21　                    
 *  |    @description   视频消息　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class ShiPinMessage extends Message{
    private int mediaId;//视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private int thumbMediaId;//视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

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
