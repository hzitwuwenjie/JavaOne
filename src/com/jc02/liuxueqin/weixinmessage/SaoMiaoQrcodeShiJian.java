package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 16:56　                    
 *  |    @description   1. 用户未关注时，进行关注后的事件推送；2. 用户已关注时的事件推送　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class SaoMiaoQrcodeShiJian extends ShiJian{
    //subscribe(订阅)、unsubscribe(取消订阅)
    private String eventKey;//事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String ticket;//二维码的ticket，可用来换取二维码图片

    public SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum event) {
        super(event.toString());
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

}
