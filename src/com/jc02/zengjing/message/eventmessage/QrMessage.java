package com.jc02.zengjing.message.eventmessage;

import com.jc02.zengjing.message.Message;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:35
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class QrMessage extends Message{

    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}