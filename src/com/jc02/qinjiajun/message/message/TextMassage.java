package com.jc02.qinjiajun.message.message;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 16:17
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public  class TextMassage extends Message {
    public String content;
    public TextMassage(){
        super("text");
    }

    public String toString(){
        return  "this is a test";
    }

    public void showXml(){
        System.out.println("<xml>");
        System.out.println("<ToUserName><![CDATA["+ getToUserName()   +"]]></ToUserName>");
        System.out.println("<FromUserName><![CDATA[" +  getFromUserName()    +       "]]></FromUserName>");
        System.out.println("<CreateTime>"   +getCreateTime() +   "  </CreateTime>");
        System.out.println("<MsgType><![CDATA["+ getMsgType() +"]]></MsgType>");
        System.out.println("<Content><![CDATA["+getContent()  +" ]]></Content>");
        System.out.println("<MsgId> " + getMsgId() +"</MsgId>");
        System.out.println("<xml>");

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}