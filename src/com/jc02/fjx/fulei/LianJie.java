package com.jc02.fjx.fulei;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:37
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianJie extends PuTongXiaoxi {
    private String title;
    private String description;
    private String url;

    public LianJie() {
        super("link");
    }

    public void ShowXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println(" <FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Title><![CDATA["+getTitle()+"]]></Title>");
        System.out.println("  <Description><![CDATA["+getDescription()+"]]></Description>");
        System.out.println("<Url><![CDATA["+getUrl()+"]]></Url>");
        System.out.println("<MsgId>"+ UUID.randomUUID().toString()+"</MsgId>");
        System.out.println("</xml>");

}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
