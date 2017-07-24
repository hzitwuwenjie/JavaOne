package com.jc02.jiangzixu.message;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class Messgae {
    private String toUserName;//开发者微信号
    private String fromUserName;//发送方帐号（一个OpenID）
    private int createTime;//消息创建时间 （整型）
    private String msgType;//text



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
