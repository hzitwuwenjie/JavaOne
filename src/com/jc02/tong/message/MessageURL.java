package com.jc02.tong.message;

/**
 * 岁月是一场有去无回的旅行.
 */
public class MessageURL extends Message {
    private String title;
    private String description;
    private String Url;
    private int MsgId;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getMsgId() {
        return MsgId;
    }

    public void setMsgId(int msgId) {
        MsgId = msgId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}