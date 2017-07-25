package com.jc02.lwj.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 18:11
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends CommonMessage {
    private String mediaId;
    private String tehumbMediaId;

public VideoMessage(VideoType msgType){
        super(msgType.toString());}
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getTehumbMediaId() {
        return tehumbMediaId;
    }

    public void setTehumbMediaId(String tehumbMediaId) {
        this.tehumbMediaId = tehumbMediaId;
    }


}
