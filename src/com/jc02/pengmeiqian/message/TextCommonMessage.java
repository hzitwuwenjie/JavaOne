package com.jc02.pengmeiqian.message;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月24日 - 16:10
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class TextCommonMessage extends CommonMessage {
    private String content;

    public TextCommonMessage() {
        super("text");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
