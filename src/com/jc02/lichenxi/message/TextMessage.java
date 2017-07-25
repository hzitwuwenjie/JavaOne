package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class TextMessage extends CommonMessage {
    private String content;	//文本消息内容

    public TextMessage(String msgType) {
        super(msgType);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
