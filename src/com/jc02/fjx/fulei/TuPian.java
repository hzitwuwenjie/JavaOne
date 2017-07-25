package com.jc02.fjx.fulei;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:17
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TuPian extends PuTongXiaoxi {
    private String picUrl;
    private String mediaId;
    public TuPian(){
        super("image");
    }

    @Override
        public void ShowXml(){
       System.out.println("<xml>");
       System.out.println(" <ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
       System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
       System.out.println("<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
       System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
       System.out.println("<PicUrl><![CDATA["+getPicUrl()+"]]></PicUrl>");
       System.out.println("<MediaId><![CDATA["+getMediaId()+"]]></MediaId>");
       System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
       System.out.println("</xml>");
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
