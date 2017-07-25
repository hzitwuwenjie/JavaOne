package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class QrsceneMessage extends ClickMessage{
    private String ticket;	//二维码的ticket，可用来换取二维码图片

    public QrsceneMessage(String msgType) {
        super(msgType);
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
