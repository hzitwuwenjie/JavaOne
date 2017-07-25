package com.jc02.zoudongping.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:37
 * |    @description   扫描带参数二维码事件
 * +---------------------------------Oooo---------------------------------------+
 */
public class ScanMessage extends ShijianMessage{
    private int eventkey;
    private String ticket;

    public ScanMessage(String tousername, String event,int eventkey) {
        super(tousername,event);this.eventkey=eventkey;
    }
    public ScanMessage(){
        eventkey=1234;ticket="124213";
    }
    public int getEventkey() {
        return eventkey;
    }

    public void setEventkey(int eventkey) {
        this.eventkey = eventkey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}