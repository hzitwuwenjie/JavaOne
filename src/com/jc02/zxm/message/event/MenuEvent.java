package com.jc02.zxm.message.event;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月24日 - 16:58　                           |
 * |    @description   菜单事件　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class MenuEvent extends EventMessage {
   private String eventKey;//	事件KEY值，与自定义菜单接口中KEY值对应

    public MenuEvent() {
        super("CLICK");
    }


    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
    public void showXml()
    {

    }
}

