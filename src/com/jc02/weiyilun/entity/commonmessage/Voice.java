package com.jc02.weiyilun.entity.commonmessage;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:21
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Voice extends Message
{
    private int mediaID;
    private String format;
    private String recognition;

    public int getMediaID() {
        return mediaID;
    }

    public void setMediaID(int mediaID) {
        this.mediaID = mediaID;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }
}
