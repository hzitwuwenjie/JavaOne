package com.jc02.zengjing.message;

import com.jc02.zengjing.message.Message;

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
public class ComMessage extends Message {
    private String msgId;
    public ComMessage(String msgType){
        super(msgType);
    }
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        msgId = msgId;
    }
}