package com.jc02.xieshuyuan.lianxi.entity.message.commmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.CommMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:19
 * |    @description   文本消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMassage extends CommMessage {
    private String content;  //文本消息内容
    public TextMassage(){
        super("text");
    }
    public String toString(){
        return getFromUserName()+"发了一个消息给"+getToUserName()+"说："+getContent();
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t <Content><![CDATA["+getContent()+"]]></Content>");
        System.out.println("\t<MsgId><![CDATA["+getMsgId()+"]]></MsgId>");
        System.out.println("</xml>");
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
