package com.jc02.zoudongping.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:33
 * |    @description   时间消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class ShijianMessage extends Message {
    private String event;
    public ShijianMessage(){
        event="6666";
    }
    public ShijianMessage(String tousername,String event){
        super(tousername);this.event=event;
    }
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

}