package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:37
 * |  @description   关注或取消事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class EventMessage extends Message {

    private String event;

    public EventMessage(String event){
        super("event");
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

}
