package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:34　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class FollowMessage extends EventMessage {
    private String eventKey;//	事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id
    private String ticket;//	二维码的ticket，可用来换取二维码图片
    public FollowMessage(Followtype event){
        super(event.toString());
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public void showxml() {


    }
}

