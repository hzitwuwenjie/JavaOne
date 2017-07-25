package com.jc02.xieshuyuan.lianxi.entity.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:54
 * |    @description   事件父类小心类
 * +---------------------------------Oooo---------------------------------------+
 */
public class EventMessage extends Message{
    private String event;	//事件类型，subscribe(订阅)、unsubscribe(取消订阅)
    public EventMessage(String msgType,String event){
        super("event");
        this.event=event;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
