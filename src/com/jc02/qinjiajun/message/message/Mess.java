package com.jc02.qinjiajun.message.message;


import java.util.UUID;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:50
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract  class Mess {
    public String toUserName;
    public String fromUserName;
    public int createTime;
    public String msgType;

    public Mess(String msgType){
        this.msgType=msgType;
    }
    public Mess(){

    }
    /*
       <xml>
    <ToUserName><![CDATA[toUser]]></ToUserName>
    <FromUserName><![CDATA[fromUser]]></FromUserName>
    <CreateTime>1348831860</CreateTime>
    <MsgType><![CDATA[text]]></MsgType>
    <Content><![CDATA[this is a test]]></Content>
    <MsgId>1234567890123456</MsgId>
    </xml>
     */
    public void ShowXml(Mess mess){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ mess.toUserName   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" + mess.fromUserName      +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +mess.createTime+   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+      mess.msgType +"]]></MsgType>");
        System.out.println("<Content><![CDATA["+ mess.toString()   +" ]]></Content>");
        System.out.println("<MsgId> " + UUID.randomUUID() +"</MsgId>");
        System.out.println("<xml>");

    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}