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

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}
