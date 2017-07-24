package com.jc02.jiangzixu.message;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class TextMessage extends Messgae {

    public String getConTent() {
        return conTent;
    }

    public void setConTent(String conTent) {
        this.conTent = conTent;
    }

    private String conTent;//文本消息内容

}
