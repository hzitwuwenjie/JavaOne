package com.jc02.fjx.fulei;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:20
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class YuYin extends PuTongXiaoxi {
    private  String mediaId;
    private  String format;

    private  String recognition;

    public YuYin() {
        super("voice");
    }

    public void ShowXml(){
        System.out.println("<xml>");
        System.out.println(" <ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println(" <FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println(" <CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
        System.out.println(" <MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println(" <MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
        System.out.println(" <Format><![CDATA["+getFormat()+"]]></Format>");
        System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
        System.out.println("</xml>");

    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }



    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
