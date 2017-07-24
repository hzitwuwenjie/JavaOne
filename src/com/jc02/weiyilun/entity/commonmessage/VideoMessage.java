package com.jc02.weiyilun.entity.commonmessage;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:26
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends Message
{
    private int mediaId;
    private int thumbMediaId;

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
