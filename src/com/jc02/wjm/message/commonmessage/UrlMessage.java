package com.jc02.wjm.message.commonmessage;

import com.jc02.wjm.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:30
 * |  @description   链接消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class UrlMessage extends CommonMessage {
    private String title;	//消息标题
    private String description;	//消息描述
    private String url;	//消息链接

    public UrlMessage() {
        super("link");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]</ToUserName>");
        System.out.println("<FromUserName><![CDATA["+getFromUserName()+"]]</FromUserName>");
        System.out.println("<CreateTime>"+getCreateTime()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]</MsgType>");
        System.out.println("<getTitle><![CDATA["+getTitle()+"]]</getTitle>");
        System.out.println("<Description><![CDATA["+getDescription()+"]]</Description>");
        System.out.println("<Url><![CDATA["+getUrl()+"]]</Url>");
        System.out.println("<MsgId>"+getMsgId()+"</MsgId>");
        System.out.println("</xml>");

    }
}
