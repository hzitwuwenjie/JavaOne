package com.jc02.yangyoufeng.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月24日 - 17:08
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ClickMessage extends EventMessage {
    private String event;//	事件类型，CLICK
    private String eventKey;//	事件KEY值，与自定义菜单接口中KEY值对应

    @Override
    public String getEvent() {
        return event;
    }

    @Override
    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}