package com.jc02.fjx.fulei;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:15
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class WenBenXiaoxi extends PuTongXiaoxi {
    private String content;
    public WenBenXiaoxi(){
        super("text");
    }
    public void ShowXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Content><![CDATA["+getContent()+"]]></Content>");
        System.out.println("\t<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
        System.out.println("</xml>");
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
