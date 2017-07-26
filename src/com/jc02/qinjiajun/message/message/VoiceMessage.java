package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:20
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class VoiceMessage extends Message{
    public String mediaId;
    public String format;
    public String recognition;
    public VoiceMessage(){
        super("Voice");
    }

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<format><![CDATA["+ getFormat() +" ]]></format>");
        System.out.println("<mediaId><![CDATA["+ getMediaId()+" ]]></mediaId>");
        System.out.println("<recognition><![CDATA["+ getRecognition()+" ]]></recognition>");
        System.out.println("<MsgId> " + getMsgId() +"</MsgId>");
        System.out.println("<xml>");

    }
    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}