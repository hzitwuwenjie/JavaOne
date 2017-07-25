package com.jc02.huangkangming.message.eventmessage;

import com.jc02.huangkangming.message.type.MenuEventType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:56
 * |  @description 自定义菜单事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class MenuEventMessage extends EventMessage {
    private String eventKey;

    public MenuEventMessage(MenuEventType event) {
        super(event.toString());
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}