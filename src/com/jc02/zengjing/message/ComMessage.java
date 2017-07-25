package com.jc02.zengjing.message;

import com.jc02.zengjing.message.Message;

import java.util.UUID;

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
public abstract class ComMessage extends Message {

    public ComMessage(String msgType){
        super(msgType);
        this.msgId= UUID.randomUUID().toString();
    }
    private String msgId;
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        msgId = msgId;
    }
    public String toString(){
        return getFromUserName()+"发送了一条普通信息给"+getToUserName();
    }
    public abstract void showXml();
}