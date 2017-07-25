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

    public SaoMiaoShijian(String event) {
        super(event);
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
