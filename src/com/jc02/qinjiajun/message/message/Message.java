package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:13
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class Message extends Mess{
    public Message(String msgType){
        super(msgType);
    }

    private String   msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

}