package com.jc02.xiongzairen.message;

import java.util.UUID;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:55
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract  class CommonMessage extends Message {


    private String msgId;
    public CommonMessage(String type){
        super(type);
        this.msgId= UUID.randomUUID().toString();

    }
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }


}
