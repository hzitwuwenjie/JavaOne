package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:10　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Message {
    private String toUserName;//	开发者微信号
    private String fromUserName;//	发送方帐号（一个OpenID）
    private String createTime;//	消息创建时间 （整型）
    private String msgType;//	text





    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        fromUserName = fromUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        msgType = msgType;
    }


}

