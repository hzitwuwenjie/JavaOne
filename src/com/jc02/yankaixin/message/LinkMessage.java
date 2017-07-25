package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:34
 * |  @description   链接消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends CommonMessage {

    private String title;
    private String description;
    private String url;

    public LinkMessage(){
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

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<Title>" + this.getTitle() + "</Title>");
        System.out.println("\t<Description>" + this.getDescription()+ "</Description>");
        System.out.println("\t<Url>" + this.getUrl()+ "</Url>");
        System.out.println("\t<MsgId>" + this.getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}
