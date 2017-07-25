package com.jc02.fankelei.massage;



/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 16:55
 * |    @description
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
