package com.jc02.jiangzixu.message;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class EventsMessage extends Messgae {
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    private String event;
}
