package com.jc02.huangkangming.message.commonmessage;

import java.util.UUID;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:49
 * |  @description 普通消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public  abstract  class CommonMessage extends Message {
    private String msgId;

    public CommonMessage(String msgType) {
        super(msgType);
        this.msgId= UUID.randomUUID().toString();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}