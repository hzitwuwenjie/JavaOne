package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:12　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.UUID;

public class TextMessage extends CommonMessage {
    public TextMessage(){
        super("text");
    }
    public void showxml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName>"+getToUserName()+" </ToUserName>");
        System.out.println("<FromUserName>"+getFromUserName()+" </ToUserName>");
        System.out.println("<CreateTime>"+ System.currentTimeMillis()+" </CreateTime>");
        System.out.println("<Content>"+ getContent()+" </Content>");
        System.out.println("<MagType>"+ getMsgType()+" </MagType>");
        System.out.println("<MsgId>"+UUID.randomUUID()+" </MsgId>");
        System.out.println("</xml>");

    }
   private String content;//	文本消息内容

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

