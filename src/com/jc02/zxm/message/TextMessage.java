package com.jc02.zxm.message;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月24日 - 16:16　                           |
 * |    @description   文本消息　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class TextMessage extends CommonMsg {
    private String content;//	文本消息内容

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

