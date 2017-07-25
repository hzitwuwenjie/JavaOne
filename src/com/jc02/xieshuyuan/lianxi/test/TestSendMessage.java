package com.jc02.xieshuyuan.lianxi.test;

import com.jc02.xieshuyuan.lianxi.entity.message.commmessage.ImageMessage;
import com.jc02.xieshuyuan.lianxi.entity.message.commmessage.TextMassage;
import com.jc02.xieshuyuan.lianxi.service.MessageServices;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月25日 - 11:36
 * |    @description   测试发送消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestSendMessage {
    public static void main(String[] args) {
        TextMassage message=new TextMassage();
        message.setToUserName("谢树源");
        message.setFromUserName("美女");
        message.setContent("帅哥，你真帅！(❤ ω ❤)");
        message.setCreateTime(System.currentTimeMillis());
        //System.out.println("消息内容:"+message.toString());

        ImageMessage message1=new ImageMessage();
        message1.setToUserName("谢树源");
        message1.setFromUserName("大神");
        message1.setPicUrl("http://img1.gtimg.com/ninja/1/2017/07/ninja150012654723524.jpg");
        message.setCreateTime(System.currentTimeMillis());
        System.out.println("消息内容:"+message1.toString());
        MessageServices m=new MessageServices();
        m.senMag(message);
    }
}
