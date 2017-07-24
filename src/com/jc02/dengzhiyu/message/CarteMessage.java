package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:40　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class CarteMessage extends Message1 {
    private String eventKey;//	事件KEY值，与自定义菜单接口中KEY值对应

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        eventKey = eventKey;
    }
}

