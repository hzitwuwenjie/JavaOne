package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ItemEventMessage extends  EventMessage {
    public String eventKey;
    public ItemEventMessage(){
        super("CLICK");
    }

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<Content><![CDATA["+getEventKey()  +" ]]></Content>");
        System.out.println("<MsgId> " + getEvent() +"</MsgId>");
        System.out.println("<xml>");

    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }
}