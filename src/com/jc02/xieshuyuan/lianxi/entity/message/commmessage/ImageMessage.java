package com.jc02.xieshuyuan.lianxi.entity.message.commmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.CommMessage;
import com.jc02.xiongzairen.message.ImgMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:21
 * |    @description   图片消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImageMessage extends CommMessage {

    private String picUrl; //	图片链接（由系统生成）
    private String mediaId; //	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

    public ImageMessage(String msgType){
        super("image");
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
