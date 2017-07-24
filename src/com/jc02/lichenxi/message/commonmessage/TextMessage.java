package com.jc02.lichenxi.message.commonmessage;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class TextMessage extends SecMessage {
    private String Content;	//文本消息内容

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
