package com.jc02.xieshuyuan.lianxi.entity.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:14
 * |    @description   消息父类
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class Message {
    private String toUserName; //	开发者微信号
    private String fromUserName; //	发送方帐号（一个OpenID）
    private long createTime; //	消息创建时间 （整型）
    private String msgType; //	text
    public Message(String msgType){
        this.msgType=msgType;
    }
    public String toString(){
        return getFromUserName()+"发了一个消息给"+getToUserName();
    }

    public void showXml(){

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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }


}
