package com.jc02.tong.message;

/**
 * 岁月是一场有去无回的旅行.
 */
public class EventScanning extends Event {

    private int EventKey;
    private String Ticket;

    public int getEventKey() {
        return EventKey;
    }

    public void setEventKey(int eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }


}