package com.jc02.zoudongping.message;

import com.jc02.zoudongping.message.Message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:33
 * |    @description   时间消息
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class EventMessage extends Message {
    private String event;

    public EventMessage(String event) {
        super("event");
        this.event=event;
    }
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }



}