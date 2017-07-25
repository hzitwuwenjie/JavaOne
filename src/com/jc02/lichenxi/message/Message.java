package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class Message {
    private String toUserName;    //开发者微信号
    private String fromUserName;    //发送方帐号（一个OpenID）
    private int createTime;    //消息创建时间 （整型）
    private String msgType;
    public Message(String msgType){
        this.msgType=msgType;
    }

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

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

}