package com.jc02.zxm.message.message;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月24日 - 16:12　                           |
 * |    @description   消息父类　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public abstract class Message {
    private  String toUserName;//	开发者微信号
    private  String fromUserName;//	发送方帐号（一个OpenID）
    private  long createTime;//	消息创建时间 （整型）
    private String msgType;//消息类型
    public Message(String msgType){
        this.msgType=msgType;
    }
    public  String toString(){
        return fromUserName+"给"+toUserName+"发了一条消息";

    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

     public abstract void showXml();
}

