package com.jc02.xieshikai.msg.event;

import com.jc02.xieshikai.msg.Message;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月24日 - 16:43
 * |  @description   基础事件消息类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public abstract class EventMessage extends Message {
    private String event;          //事件类型

    public EventMessage(String event){
        super("event");
        this.event=event;
    }
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public abstract void showXml();
}
