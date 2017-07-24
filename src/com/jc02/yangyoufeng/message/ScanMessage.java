package com.jc02.yangyoufeng.message;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月24日 - 17:03
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ScanMessage extends EventMessage {
    private String eventKey;//事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id
    private String ticket;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}