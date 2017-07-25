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

        ShiPinMessage shipin1=new ShiPinMessage(ShiPinEnum.video);
        System.out.println(shipin1.getMsgType());

        ShiPinMessage shipin2=new ShiPinMessage(ShiPinEnum.shortvideo);
        System.out.println(shipin2.getMsgType());

        DiLiWeiZhiMessage diliweizhi=new DiLiWeiZhiMessage();
        System.out.println(diliweizhi.getMsgType());

        LianJieMessage lianjie=new LianJieMessage();
        System.out.println(lianjie.getMsgType());

        SaoMiaoQrcodeShiJian saomiao1=new SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum.SCAN);
        System.out.println(saomiao1.getMsgType());
        System.out.println(saomiao1.getEvent());

        SaoMiaoQrcodeShiJian saomiao2=new SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum.subscribe);
        System.out.println(saomiao2.getMsgType());
        System.out.println(saomiao2.getEvent());

        SaoMiaoQrcodeShiJian saomiao3=new SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum.unsubscribe);
        System.out.println(saomiao3.getMsgType());
        System.out.println(saomiao3.getEvent());

        ReportDiLiShiJian report=new ReportDiLiShiJian();
        System.out.println(report.getMsgType());
        System.out.println(report.getEvent());

        ZiDingYiCaiDanShiJian zidingyi=new ZiDingYiCaiDanShiJian();
        System.out.println(zidingyi.getMsgType());
        System.out.println(zidingyi.getEvent());

    }
}
