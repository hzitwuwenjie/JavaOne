package com.jc02.xiewenqiang.messary;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:52
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ClickEvent extends Event {
    private String eventKey;//	事件KEY值，与自定义菜单接口中KEY值对应

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}
