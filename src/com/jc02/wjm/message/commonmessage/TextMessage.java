package com.jc02.wjm.message.commonmessage;

import com.jc02.wjm.message.CommonMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:15
 * |  @description   文本消息
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

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public void showXml() {

    }
}
