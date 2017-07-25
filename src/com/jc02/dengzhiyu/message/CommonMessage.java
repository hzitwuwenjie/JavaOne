package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:48　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public abstract class CommonMessage extends Message {
    public CommonMessage(String msgtype){
        super(msgtype);
    }
    public abstract void showxml();

    private String msgId;//	消息id，64位整型


    public String getMsgId() {
        return msgId;
    }


    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}

