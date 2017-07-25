package com.jc02.huangkangming.message.commonmessage;

import com.jc02.huangkangming.message.type.VideoType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:20
 * |  @description   视频消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends CommonMessage {
    private String mediaId;
    private String thumbMediaId;

    public VideoMessage(VideoType msgType)
    {
        super(msgType.toString());
    }

    @Override
    public void showXml() {
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