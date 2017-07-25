package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 16:14　                    
 *  |    @description   文本消息　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class TextMessage extends CommentMessage{
    private String content;//文本消息内容

    public TextMessage() {
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
