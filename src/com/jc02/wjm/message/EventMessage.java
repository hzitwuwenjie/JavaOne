package com.jc02.wjm.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:38
 * |  @description   取消关注事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class EventMessage extends Message {

    private String event;//	事件类型，

    public EventMessage(String msgType) {
        super("event");
    }


    public String getEvent() {
        return event;
    }


    public void setEvent(String event) {
        this.event = event;
    }

}
