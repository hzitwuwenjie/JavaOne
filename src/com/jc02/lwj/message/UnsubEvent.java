package com.jc02.lwj.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 18:02
 * |    @description   事件1
 * +---------------------------------Oooo---------------------------------------+
 */
public class UnsubEvent extends EventMessage {
    private String eventKey;
    private String ticket;
    public UnsubEvent(EventType event){
        super(event.toString());
    }

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
