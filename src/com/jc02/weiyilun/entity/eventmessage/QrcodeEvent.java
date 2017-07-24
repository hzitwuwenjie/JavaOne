package com.jc02.weiyilun.entity.eventmessage;

import com.jc02.weiyilun.entity.eventmessage.Event;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:41
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class QrcodeEvent extends Event
{
    private String eventKey;
    private  String ticket;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}
