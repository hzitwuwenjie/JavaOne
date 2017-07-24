package com.jc02.zoudongping.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:54
 * |    @description   自定义菜单事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class CustomMessage extends ShijianMessage {
    private long eventkey;

    public long getEventkey() {
        return eventkey;
    }

    public void setEventkey(long eventkey) {
        this.eventkey = eventkey;
    }
}