package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:31
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends CommonMessage {
    private String title;
    private String description;
    private String url;

    public LinkMessage() {
        super("link");
    }
    public void showxml(){
        System.out.println("<toUserName><![CDATA["+getToUserName()+"]]></toUserName>");
        System.out.println("<toFromUserName><![CDATA["+getFromUserName()+"]]></toFromUserName>");
        System.out.println("<toTitle><![CDATA["+getTitle()+"]]><toTitle>");
        System.out.println("<toCreateTime><![CDATA["+getCreateTime() + ")]]><toCreateTime>");
        System.out.println("<toMsgType><![CDATA["+getMsgType()+"]]></toMsgType>");
        System.out.println("<toDescription><![CDATA["+getDescription()+")]]></toDescription>");
        System.out.println("<toUrl><![CDATA["+getUrl()+")]]></toUrl>");
        System.out.println("<toMsgId><![CDATA["+getMsgId()+")]]></toMsgId>");
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
