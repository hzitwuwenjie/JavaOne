package com.jc02.yangyoufeng.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月24日 - 16:44
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class EventMessage extends Message{
    private String event;//	事件类型，subscribe(订阅)、unsubscribe(取消订阅)

    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
}