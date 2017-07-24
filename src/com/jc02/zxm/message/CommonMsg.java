package com.jc02.zxm.message;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月24日 - 18:51　                           |
 * |    @description   共同·属性　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class CommonMsg extends Message {
    private String msgId;//	消息id，64位整型

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}

