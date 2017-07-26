package com.jc02.xieshuyuan.lianxi.entity.message.commmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.CommMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:35
 * |    @description   链接消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends CommMessage {
    private String title;	//消息标题
    private String description;	//消息描述
    private String url;	//消息链接
    public LinkMessage(){
        super("link");
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Title><![CDATA["+getTitle()+"]]></Title>");
        System.out.println("\t<Description><![CDATA["+getDescription()+"]]></Description>");
        System.out.println("\t<Url><![CDATA["+getUrl()+"]]></Url>");
        System.out.println("\t<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
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
