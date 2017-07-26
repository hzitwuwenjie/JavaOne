package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:13
 * |  @description   文本消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends CommonMessage{

    private String content;

    public TextMessage(){
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<Content>" + this.getContent() + "</Content>");
        System.out.println("\t<MsgId>" + this.getMsgId() + "</MsgId>");
        System.out.println("</xml>");
    }
}