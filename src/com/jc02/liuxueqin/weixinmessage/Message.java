package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 16:11　                    
 *  |    @description   消息　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.security.PublicKey;

public abstract  class Message {
    private String toUserName;//开发者微信号
    private String fromUserName;//发送方帐号（一个OpenID）
    private long createTime;//消息创建时间 （整型）
    private String msgType;//text
    public Message(String msgType){
        this.msgType=msgType;
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

    public String getMsgType() {
        return msgType;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public abstract  void  showXml();
}
