package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class Message {
    private String ToUserName;    //开发者微信号
    private String FromUserName;    //发送方帐号（一个OpenID）
    private int CreateTime;    //消息创建时间 （整型）
    private String MsgType;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}