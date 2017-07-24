package com.jc02.huangkangming.message.commonmessage;

import com.jc02.huangkangming.message.commonmessage.Message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:14
 * |  @description   图片信息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class PicMessage extends Message1 {
    private String picURL;
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }
}