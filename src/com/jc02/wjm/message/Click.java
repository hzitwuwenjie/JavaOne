package com.jc02.wjm.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:52
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Click extends EventMessage {
    private String  Event;//		事件类型，CLICK


    public String getEvent() {
        return Event;
    }


    public void setEvent(String event) {
        Event = event;
    }

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    private String  EventKey;//		事件KEY值，与自定义菜单接口中KEY值对应
}
