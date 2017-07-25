package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:41
 * |  @description   扫描带参数二维码事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class QrSceneMessage extends EventMessage {

    private String eventKey;
    private String ticket;

    public QrSceneMessage(EventType event){
        super(event.toString());
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
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<Event>" + this.getEvent() + "</Event>");
        System.out.println("\t<EventKey>" + this.getEventKey() + "</EventKey>");
        System.out.println("\t<Ticket>" + this.getTicket() + "</Ticket>");
        System.out.println("</xml>");
    }
}
