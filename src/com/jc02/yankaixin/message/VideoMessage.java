package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:26
 * |  @description   视频消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class VideoMessage extends CommonMessage {

    private int mediaId;
    private int thumbMediaId;

    public VideoMessage(VideoType msgType){
        super(msgType.toString());
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public int getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(int thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<MediaId>" + this.getMediaId() + "</MediaId>");
        System.out.println("\t<ThumbMediaId>" + this.getThumbMediaId() + "</ThumbMediaId>");
        System.out.println("\t<MsgId>" + this.getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}
