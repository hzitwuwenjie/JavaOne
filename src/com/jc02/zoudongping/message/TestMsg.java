package com.jc02.zoudongping.message;

import com.jc02.zoudongping.message.commonmessage.ImgMessage;
import com.jc02.zoudongping.message.commonmessage.TextMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 13:43
 * |    @description   发送消息测试
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMsg {
    public static void main(String[] args) {
        //父类的引用,指向子类的对象
        Message msg=new ImgMessage();
        //msg代表了父类的引用，在编码阶段msg都代表父类，在执行阶段代表子类。
        //如果需要强制调用子类的方法，我们可以强制类型转换
        ((ImgMessage) msg).setTousername("邹东平");
        msg.setFromusername("雪梅");
        ((ImgMessage) msg).setPicurl("www");
        System.out.println(msg.toString());
        ImgMessage message=new ImgMessage();
        message.setTousername("邹东平");
        message.setFromusername("雪");
        message.setPicurl("http://www.baidu.com");
        MessageService m=new MessageService();
        m.sendMsg(message);
    }
}