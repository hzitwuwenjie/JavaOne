package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:21
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends CommonMessage {
    private long mediaId;
    private String  thumbMediaId;

    public VideoMessage(VideoType type) {
        super(type.toString());
    }
    public void showxml(){
        System.out.println("<xml>");

        System.out.println("<toUserName><![CDATA["+getToUserName()+"]]></toUserName>");
        System.out.println("<toFromUserName><![CDATA["+getFromUserName()+"]]></toFromUserName>");
        System.out.println("<toContent><![CDATA["+getMediaId()+"]]><toContent>");
        System.out.println("<toCreateTime><![CDATA["+getCreateTime()+")]]><toCreateTime>");
        System.out.println("<toMsgType><![CDATA["+getMsgType()+"]]></toMsgType>");
        System.out.println("<toFormat><![CDATA["+getThumbMediaId()+"]]></toFormat>");
        System.out.println("<toMsgId><![CDATA["+getMsgId()+")]]></toMsgId>");
        System.out.println("</xml>");
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public long getMediaId() {
        return mediaId;
    }

    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
    }



}
