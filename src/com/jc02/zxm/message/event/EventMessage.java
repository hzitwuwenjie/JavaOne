package com.jc02.zxm.message.event;

import com.jc02.zxm.message.message.Message;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月24日 - 16:45　                           |
 * |    @description   接受与取消关注事件消息　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public abstract class EventMessage extends Message {
     private String event;


    public EventMessage(String event){
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

