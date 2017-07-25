package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:13
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends CommonMessage {
    private String	text;
    private String content;

    public TextMessage() {
        super("text");
    }

    public void showxml(){
        System.out.println("<xml>");

        System.out.println("<toUserName><![CDATA[getToUserName]]></toUserName>");
        System.out.println("<toFromUserName><![CDATA[getFromUserName]]></toFromUserName>");
        System.out.println("<toContent><![CDATA[getContent]]><toContent>");
        System.out.println("<toCreateTime><![CDATA[getCreateTime]]><toCreateTime>");
        System.out.println("<toMsgType><![CDATA[text]]></toMsgType>");
        System.out.println("<toMsgId><![CDATA[getMsgId]]></toMsgId>");
        System.out.println("</xml>");
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }




}
