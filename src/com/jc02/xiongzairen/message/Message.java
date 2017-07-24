package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:09
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Message {
     private String toUserName;
     private String fromUserName;
     private long  createTime;
     private String  msgType;
    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }



    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
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




}
