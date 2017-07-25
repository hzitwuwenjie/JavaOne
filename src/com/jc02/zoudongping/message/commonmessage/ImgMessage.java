package com.jc02.zoudongping.message.commonmessage;

import com.jc02.zoudongping.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:17
 * |    @description   图片消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class ImgMessage extends CommonMessage {
    private String picurl;
    private String mediaid;


    public ImgMessage() {
        super("image");
    }




    public String getMediaid() {
        return mediaid;
    }

    public void setMediaid(String mediaid) {
        this.mediaid = mediaid;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String toString(){
        return getFromusername()+"向"+getTousername()+"发了一张图片,图片地址是"+getPicurl();
    }

    public void showXml(){
        System.out.println("<xml><ToUserName><![CDATA["+getTousername()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromusername()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+getCreatetime()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgtype()+"]]></MsgType>");
        System.out.println("\t<Picurl><![CDATA["+getPicurl()+"]]></Picurl>");
        System.out.println("\t<MediaId>"+getMediaid()+"</MediaId>");
        System.out.println("\t<MsgId>"+getMsgid()+"</MsgId>");
        System.out.println("</xml>");
    }
}