package com.jc02.jiangzixu.message;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class VoiceMessage extends Messgae{
    private String mediaId;//语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String fommat;//语音格式，如amr，speex等

    public String getFommat() {
        return fommat;
    }

    public void setFommat(String fommat) {
        this.fommat = fommat;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }


}
