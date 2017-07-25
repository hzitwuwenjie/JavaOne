package com.jc02.liuxueqin.text;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月25日 - 10:03　                    
 *  |    @description   测试消息　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.jc02.liuxueqin.weixinmessage.*;

public class TestMessage {
    public static void main(String[] args) {
        TextMessage m=new TextMessage();
        System.out.println(m.getMsgType());
        Imgmessage img=new Imgmessage();
        System.out.println(img.getMsgType());
        YuYinMessage yuyin=new YuYinMessage();
        System.out.println(yuyin.getMsgType());
        ShiPinMessage shipin=new ShiPinMessage();
        System.out.println(shipin.getMsgType());
        DiLiWeiZhiMessage diliweizhi=new DiLiWeiZhiMessage();
        System.out.println(diliweizhi.getMsgType());
        LianJieMessage lianjie=new LianJieMessage();
        System.out.println(lianjie.getMsgType());
    }
}
