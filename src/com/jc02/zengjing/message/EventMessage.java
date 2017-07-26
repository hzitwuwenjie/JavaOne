package com.jc02.zengjing.message;

import com.jc02.zengjing.message.Message;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 17:31
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class EventMessage extends Message{
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
    public String toString(){
        return getFromUserName()+"发送了一条事件信息给"+getToUserName();
    }
    public abstract void showXml();
}