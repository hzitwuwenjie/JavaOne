package com.jc02.xiewenqiang.messary;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:53
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ViewEvent extends Event {
    private String eventKey;//	事件KEY值，设置的跳转URL

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}
