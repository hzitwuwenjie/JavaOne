package com.jc02.xiewenqiang.messary;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:33
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LinkMessage extends Message {
    private String title;//	消息标题
    private String description;//	消息描述
    private String url;//	消息链接
    private long msgId;//	消息id，64位整型

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
