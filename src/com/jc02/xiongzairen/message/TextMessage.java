package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:13
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TextMessage extends Message2{
    private String	text;
    private String content;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }




}
