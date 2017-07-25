package com.jc02.xiewenqiang.message;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 17:18
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class CommonMessage extends Message {


    private long msgId;//	消息id，64位整型

    public CommonMessage(String type) {
        super(type);
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }
}
