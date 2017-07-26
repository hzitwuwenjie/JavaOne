package com.jc02.xieshikai.msg.event;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月24日 - 16:58
 * |  @description   用户已关注时的事件推送
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class ScanEventMessage extends EventMessage{
    private String eventKey;//事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id
    private String ticket;  //二维码的ticket，可用来换取二维码图片

    public ScanEventMessage(ScanEventType scanevent) {
        super(scanevent.toString());
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

    @Override
    public void showXml() {

    }
}
