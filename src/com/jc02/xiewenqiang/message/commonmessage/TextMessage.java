package com.jc02.xiewenqiang.message.commonmessage;

import com.jc02.xiewenqiang.message.CommonMessage;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 16:15
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends CommonMessage {
    private String content;//	文本消息内容

    public TextMessage() {
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content ) {
        this.content = content;
    }
}
