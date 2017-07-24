package com.jc02.wjm.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:40
 * |  @description   扫描带参数二维码时间
 * +---------------------------------Oooo---------------------------------------+
 */
public class Subscribe extends EventMessage {

    private String  eventKey;//	事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String ticket;//	二维码的ticket，可用来换取二维码图片

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;

    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
