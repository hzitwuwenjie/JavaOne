package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:27
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends  Message {
    public String title;
    public String description;
    public String url;
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<title><![CDATA["+getTitle()  +" ]]></title>");
        System.out.println("<description><![CDATA["+getDescription() +" ]]></description>");
        System.out.println("<url><![CDATA["+getUrl() +" ]]></url>");
        System.out.println("<MsgId> " + getMsgId() +"</MsgId>");
        System.out.println("<xml>");

    }

    public LinkMessage() {
        super("Link");
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