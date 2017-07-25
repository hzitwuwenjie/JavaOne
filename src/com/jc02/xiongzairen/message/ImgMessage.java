package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:14
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImgMessage extends CommonMessage {
   
    private String picUrl;
    private long mediaId;

    public ImgMessage() {
        super("image");
    }
    public void showxml(){
        System.out.println("<xml>");

        System.out.println("<toUserName><![CDATA["+getToUserName()+"]]></toUserName>");
        System.out.println("<toFromUserName><![CDATA["+getFromUserName()+"]]></toFromUserName>");
        System.out.println("<toPicUrl><![CDATA["+getPicUrl()+"]]><toPicUrl>");
        System.out.println("<toCreateTime><![CDATA["+getCreateTime()+")]]><toCreateTime>");
        System.out.println("<toMsgType><![CDATA["+getMsgType()+"]]></toMsgType>");
        System.out.println("<toMediaId><![CDATA["+getMediaId()+"]]></toMediaId>");
        System.out.println("<toMsgId><![CDATA["+getMsgId()+")]]></toMsgId>");
        System.out.println("</xml>");

    }

    public long getMediaId() {
        return mediaId;
    }

    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }



}
