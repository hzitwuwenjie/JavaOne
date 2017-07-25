package com.jc02.zoudongping.message;

import com.jc02.zoudongping.message.Message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 14:20
 * |    @description   普通消息
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class CommonMessage extends Message {
    private int msgid;

    public CommonMessage(String msgType) {
        super(msgType);
    }


    public int getMsgid() {
        return msgid;
    }

    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    public abstract void showXml();

}