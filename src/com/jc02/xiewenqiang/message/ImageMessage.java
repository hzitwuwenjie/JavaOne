package com.jc02.xiewenqiang.message;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:17
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImageMessage extends CommonMessage{
    private String picUrl;//	图片链接（由系统生成）
    private String pediaId;//	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPediaId() {
        return pediaId;
    }

    public void setPediaId(String pediaId) {
        this.pediaId = pediaId;
    }
}
