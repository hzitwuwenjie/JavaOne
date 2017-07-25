package com.jc02.fjx.fulei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:51
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class SaoMiaoShijian extends ShiJianXiaoxi {
    private int eventKey;
    private String  ticket;

    public SaoMiaoShijian(MeiJv event) {
        super(event.toString());
    }

    public void ShowXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println(" <FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println(" <Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println("<EventKey><![CDATA["+getEventKey()+"]]></EventKey>");
        System.out.println("<Ticket><![CDATA["+getTicket()+"]]></Ticket>");
        System.out.println("</xml>");

    }

    public int getEventKey() {
        return eventKey;
    }

    public void setEventKey(int eventKey) {
        this.eventKey = eventKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

}
