package com.jc02.huangkangming.message.test;

import com.jc02.huangkangming.message.commonmessage.TextMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 14:45
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage2 {
    public static void main(String[] args) {

        TextMessage tm =new TextMessage();
        tm.setToUserName("张三");
        tm.setFromUserName("黄康明");
        tm.setCreateTime(System.currentTimeMillis());
        tm.setContent("今天晚上一起去吃饭。");

        tm.showXml();
    }
}