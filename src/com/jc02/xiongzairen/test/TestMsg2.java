package com.jc02.xiongzairen.test;

import com.jc02.xiongzairen.message.TextMessage;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 14:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMsg2 {
    public static void main(String[] args) {
        TextMessage text=new TextMessage();
        text.setFromUserName("熊再仁");
        text.setToUserName("黄康明");
        text.setContent("yh你好！");
        text.setCreateTime(System.currentTimeMillis());
        text.setMsgId("");

    }

}
