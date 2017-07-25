package com.jc02.fankelei.massage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 16:55
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class SubscribeEvent extends Event {
    private String eventKey;//	事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String ticket;//	二维码的ticket，可用来换取二维码图片

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
