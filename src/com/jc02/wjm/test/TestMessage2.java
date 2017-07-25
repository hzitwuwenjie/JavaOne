package com.jc02.wjm.test;

import com.jc02.wjm.message.commonmessage.TextMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 14:50
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage2 {
    public static void main(String[] args) {
        TextMessage tx = new TextMessage();
        tx.setToUserName("万家明");
        tx.setFromUserName("范珂磊");
        tx.setCreateTime(System.currentTimeMillis());
        tx.setContent("吃点");
        tx.showXml();


    }
}