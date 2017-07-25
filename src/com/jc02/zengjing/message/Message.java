package com.jc02.zengjing.message;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:49
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class Message {
    private String toUserName;
    private String fromUserName;
    private long createTime;
    private String msgType;
    public Message(String msgType){
        this.msgType=msgType;
    }
    public Message(){}
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

    public String toString(){
        return getFromUserName()+"发送了一条信息给"+getToUserName();
    }

    public abstract void showXml();


}