package com.jc02.huangkangming.message.eventmessage;

import com.jc02.huangkangming.message.commonmessage.Message;
import com.jc02.huangkangming.message.eventmessage.Message2;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:39
 * |  @description   扫描带参数的二维码事件类
 * +---------------------------------Oooo---------------------------------------+
 */
public class BPQrCodeMessage  extends Message2 {
    private  String eventKey;
    private  String ticket;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}