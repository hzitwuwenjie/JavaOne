package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 17:02　                    
 *  |    @description   点击菜单拉取消息时的事件推送;点击菜单跳转链接时的事件推送　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class ZiDingYiCaiDanShiJian extends ShiJian{
    private String eventKey;//事件KEY值，与自定义菜单接口中KEY值对应
    public ZiDingYiCaiDanShiJian(ZiDingYiCaiDanShiJianEnum event){
        super(event.toString());
    }
    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Override
    public void showXml() {
        System.out.println("<xml>");
        System.out.println("\t<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println("\t<FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("\t<CreateTime><![CDATA["+getCreateTime()+"]]></CreateTime>");
        System.out.println("\t<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println("\t<Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("\t<EventKey><![CDATA["+getEventKey()+"]]></EventKey>");
        System.out.println("</xml>");
    }
}
