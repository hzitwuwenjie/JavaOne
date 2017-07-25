package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:12　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class TextMessage extends CommonMessage {
    public TextMessage(){
        super("text");
    }
   private String content;//	文本消息内容

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        content = content;
    }
}

