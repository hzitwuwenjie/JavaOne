package com.jc02.huangkangming.message.eventmessage;

import com.jc02.huangkangming.message.commonmessage.Message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:10
 * |  @description   事件消息类
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

}