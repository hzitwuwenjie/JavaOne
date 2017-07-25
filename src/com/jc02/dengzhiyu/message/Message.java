package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:10　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public abstract class Message {
    private String toUserName;//	开发者微信号
    private String fromUserName;//	发送方帐号（一个OpenID）
    private long createTime;//	消息创建时间 （整型）
    private String msgType;//

    public Message(String msgType){
        this.msgType=msgType;
    }
    public abstract void showxml();


    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}

