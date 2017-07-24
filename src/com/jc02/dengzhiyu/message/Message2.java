package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:49　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Message2 extends Message {
    private String event;//	事件类型，subscribe(订阅)、unsubscribe(取消订阅)

    @Override
    public String getEvent() {
        return event;
    }

    @Override
    public void setEvent(String event) {
        this.event = event;
    }
}

