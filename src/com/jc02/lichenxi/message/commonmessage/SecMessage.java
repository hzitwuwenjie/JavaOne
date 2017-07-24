package com.jc02.lichenxi.message.commonmessage;

import com.jc02.lichenxi.message.commonmessage.Message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class SecMessage extends Message {
    private long MsgId;	//消息id，64位整型

    public long getMsgId() {
        return MsgId;
    }

    public void setMsgId(long msgId) {
        MsgId = msgId;
    }
}
