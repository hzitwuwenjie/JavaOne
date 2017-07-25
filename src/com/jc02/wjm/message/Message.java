package com.jc02.wjm.message;

import com.jc02.qinjiajun.message.message.Mess;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:10
 * |  @description   消息父类
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class Message {
    private String toUserName;//	开发者微信号
    private String fromUserName;//	发送方帐号（一个OpenID）
    private String createTime;//	消息创建时间 （整型）
    private String msgType;//

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }
    public abstract void showXml();


}
