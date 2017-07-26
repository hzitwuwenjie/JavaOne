package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:49　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public abstract class EventMessage extends Message {
    private String event;//	事件类型，
    public EventMessage (String event){
        super("event");
        this.event=event;

    }

   public abstract void showxml();

    public String getEvent() {
        return event;
    }


    public void setEvent(String event) {
        this.event = event;
    }
}

