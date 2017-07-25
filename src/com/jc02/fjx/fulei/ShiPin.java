package com.jc02.fjx.fulei;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:23
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ShiPin extends PuTongXiaoxi {
    private  String mediaId;
    private String thumbMediaId;

    public ShiPin(MeiJu type) {
        super(type.toString());
    }

     public void ShowXml(){
         System.out.println("<xml>");
         System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
         System.out.println(" <FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
         System.out.println("<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
         System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
         System.out.println("<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
         System.out.println(" <ThumbMediaId><![CDATA["+getThumbMediaId()+"]]></ThumbMediaId>");
         System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
         System.out.println("</xml>");

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
