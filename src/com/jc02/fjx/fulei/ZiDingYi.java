package com.jc02.fjx.fulei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 16:55
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ZiDingYi extends ShiJianXiaoxi {
    private String eventKey;

    public void ShowXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+getToUserName()+"]]></ToUserName>");
        System.out.println(" <FromUserName><![CDATA["+getFromUserName()+"]]></FromUserName>");
        System.out.println("<CreateTime>"+System.currentTimeMillis()+"</CreateTime>");
        System.out.println("<MsgType><![CDATA["+getMsgType()+"]]></MsgType>");
        System.out.println(" <Event><![CDATA["+getEvent()+"]]></Event>");
        System.out.println(" <EventKey><![CDATA["+getEventKey()+"]]></EventKey>");
        System.out.println("</xml>");
    }

    public ZiDingYi(String event) {
        super(event);
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}
