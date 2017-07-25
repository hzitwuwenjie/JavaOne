package com.jc02.wjm.message;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 17:17
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class CommonMessage extends Message {
    private String msgId;//	消息id，64位整型

    public CommonMessage(String msgType) {

        super(msgType);
        this.msgId=UUID.randomUUID().toString();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
    @Override
    public abstract void showXml();
}
