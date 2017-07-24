package com.jc02.lichenxi.message;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class QrsceneMessage extends ClickMessage{
    private String Ticket;	//二维码的ticket，可用来换取二维码图片

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}
