package com.jc02.xieshuyuan.lianxi.entity.message.eventmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 17:09
 * |    @description   自定义菜单事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class CustomMenuEventMessage extends EventMessage{
    private String eventKey;	//事件KEY值，与自定义菜单接口中KEY值对应

    public CustomMenuEventMessage(){
        super("event","CLICK");
    }
    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<EventKey><![CDATA["+getEventKey()+"]]></EventKey>");
        System.out.println("</xml>");
    }
    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

}
