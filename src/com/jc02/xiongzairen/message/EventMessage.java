package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:34
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class EventMessage extends Message {
    private String event;
    public EventMessage(String event){
        super("event");
        this.event=event;
    }

    public String getEvent() {
        return event;
    }




}
