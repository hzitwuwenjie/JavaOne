package com.jc02.xieshuyuan.lianxi.entity.message.eventmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 17:03
 * |    @description   扫描带参数二维码事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ScanningQrEventMessage extends EventMessage{
    private String eventKey;  //事件KEY值，qrscene_为前缀，后面为二维码的参数值
    private String ticket;  //二维码的ticket，可用来换取二维码图片

    public ScanningQrEventMessage(String msgType){
        super("event");
    }
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
