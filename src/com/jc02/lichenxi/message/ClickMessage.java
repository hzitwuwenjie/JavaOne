package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class ClickMessage extends EventMessage{
    private String eventKey;	//事件KEY值，与自定义菜单接口中KEY值对应

    public ClickMessage() {
        super("click");
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}
