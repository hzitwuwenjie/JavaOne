package com.jc02.xiewenqiang.message;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:11
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class Message {
    private String msgType;
    private String toUserName;//	开发者微信号
    private String  fromUserName;//	发送方帐号（一个OpenID）
    private long createTime;//	消息创建时间 （整型）
    public Message(){}
    public Message(String type){
        this.msgType=type;
    }

    public String getMsgType() {
        return msgType;
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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public abstract void showXml();
}
