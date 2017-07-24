package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class EventMessage extends Message {
    private String Event;	//事件类型，subscribe(订阅)、unsubscribe(取消订阅)

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }
}
