package com.jc02.huangkangming.message.commonmessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:28
 * |  @description   链接消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends CommonMessage {
    private String title;
    private String description;

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("<Title><![CDATA["+getTitle()+"]></Title>");
        System.out.println("<Description><![CDATA["+getDescription()+"]></Description>");
        System.out.println("<Url><![CDATA["+getUrl()+"]></Url>");
        System.out.println("<MsgId><![CDATA["+getMsgId()+"]></MsgId>");
        System.out.println("</xml>");

    }

    private String url;

    public LinkMessage() {
        super("link");
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