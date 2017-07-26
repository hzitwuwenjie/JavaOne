package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:18
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImgMessage extends  Message{
    public String picUrl;
    public ImgMessage(){
        super("Img");
    }
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<Content><![CDATA["+ getPicUrl()  +" ]]></Content>");
        System.out.println("<MsgId> " + getMsgId() +"</MsgId>");
        System.out.println("<xml>");

    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

}