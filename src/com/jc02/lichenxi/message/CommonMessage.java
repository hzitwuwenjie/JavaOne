package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class CommonMessage extends Message {
    private long msgId;	//消息id，64位整型

    public CommonMessage(String msgType) {
        super(msgType);
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }
}
