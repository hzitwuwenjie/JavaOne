package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class EventMessage extends Message {
    private String event;	//事件类型，subscribe(订阅)、unsubscribe(取消订阅)

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
