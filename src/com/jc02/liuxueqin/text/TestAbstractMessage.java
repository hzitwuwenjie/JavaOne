package com.jc02.liuxueqin.text;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月25日 - 14:45　                    
 *  |    @description   测试抽象类　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.jc02.liuxueqin.weixinmessage.*;

public class TestAbstractMessage {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("\t\t\t文本消息");
        System.out.println("==================================================");
        TextMessage text=new TextMessage();
        text.setToUserName("张三");
        text.setFromUserName("李四");
        text.setCreateTime(System.currentTimeMillis());
        text.setContent("吃饭去");
        text.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t图片消息");
        System.out.println("==================================================");
        Imgmessage img=new Imgmessage();
        img.setToUserName("中离");
        img.setFromUserName("刘思涵");
        img.setCreateTime(System.currentTimeMillis());
        img.setPicUrl("http://www.baidu.bom");
        img.setMediaId("12345");
        img.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t语音消息");
        System.out.println("==================================================");
        YuYinMessage yuyin=new YuYinMessage();
        yuyin.setToUserName("阿杜");
        yuyin.setFromUserName("胡覅");
        yuyin.setCreateTime(System.currentTimeMillis());
        yuyin.setMediaId(1213);
        yuyin.setFormat("欧安好");
        //yuyin.setRecognition("啊啊啊啊");
        yuyin.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t视频消息");
        System.out.println("==================================================");
        ShiPinMessage shipin1=new ShiPinMessage(ShiPinEnum.video);
        shipin1.setToUserName("随后");
        shipin1.setFromUserName("好的");
        shipin1.setCreateTime(System.currentTimeMillis());
        shipin1.setMediaId(123455);
        shipin1.setThumbMediaId(34357);
        shipin1.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t短视频消息");
        System.out.println("==================================================");
        ShiPinMessage shipin2=new ShiPinMessage(ShiPinEnum.shortvideo);
        shipin2.setToUserName("随后");
        shipin2.setFromUserName("好的");
        shipin2.setCreateTime(System.currentTimeMillis());
        shipin2.setMediaId(123455);
        shipin2.setThumbMediaId(34357);
        shipin2.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t地理位置消息");
        System.out.println("==================================================");
        DiLiWeiZhiMessage dili=new DiLiWeiZhiMessage();
        dili.setToUserName("滴滴");
        dili.setFromUserName("今晚青岛");
        dili.setCreateTime(System.currentTimeMillis());
        dili.setLocation_X(78.09);
        dili.setLocation_Y(67.98);
        dili.setScale("小");
        dili.setLabel("江南");
        dili.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t链接消息");
        System.out.println("==================================================");
        LianJieMessage lianjie=new LianJieMessage();
        lianjie.setToUserName("你好");
        lianjie.setFromUserName("哦");
        lianjie.setCreateTime(System.currentTimeMillis());
        lianjie.setTitle("大人");
        lianjie.setDescription("大人好");
        lianjie.setUrl("http://www.baidu.daren.com/");
        lianjie.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t订阅事件");
        System.out.println("==================================================");
        SaoMiaoQrcodeShiJian saomiao1=new SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum.subscribe);
        saomiao1.setToUserName("礼盒");
        saomiao1.setFromUserName("嘟嘟");
        saomiao1.setCreateTime(System.currentTimeMillis());
        saomiao1.setEventKey("事件KEY值，qrscene_为前缀，后面为二维码的参数值");
        saomiao1.setTicket("二维码的ticket，可用来换取二维码图片");
        saomiao1.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t取消订阅事件");
        System.out.println("==================================================");
        SaoMiaoQrcodeShiJian saomiao2=new SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum.unsubscribe);
        saomiao2.setToUserName("哈哈");
        saomiao2.setFromUserName("啦啦");
        saomiao2.setCreateTime(System.currentTimeMillis());
        saomiao2.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t扫描事件");
        System.out.println("==================================================");
        SaoMiaoQrcodeShiJian saomiao3=new SaoMiaoQrcodeShiJian(SaoMiaoShiJianEnum.SCAN);
        saomiao3.setToUserName("礼盒");
        saomiao3.setFromUserName("嘟嘟");
        saomiao3.setCreateTime(System.currentTimeMillis());
        saomiao3.setEventKey("事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id");
        saomiao3.setTicket("二维码的ticket，可用来换取二维码图片");
        saomiao3.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t上报地理位置事件");
        System.out.println("==================================================");
        ReportDiLiShiJian report=new ReportDiLiShiJian();
        report.setToUserName("滴滴");
        report.setFromUserName("今晚青岛");
        report.setCreateTime(System.currentTimeMillis());
        report.setLatitude("89");
        report.setLongitude("67.98");
        report.setPrecision("小");
        report.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t自定义菜单事件");
        System.out.println("==================================================");
        ZiDingYiCaiDanShiJian zidingyi1=new ZiDingYiCaiDanShiJian(ZiDingYiCaiDanShiJianEnum.CLICK);
        zidingyi1.setToUserName("阿迪");
        zidingyi1.setFromUserName("啥苏");
        zidingyi1.setCreateTime(System.currentTimeMillis());
        zidingyi1.setEventKey("事件KEY值，与自定义菜单接口中KEY值对应");
        zidingyi1.showXml();
        System.out.println("==================================================");
        System.out.println("\t\t\t自定义菜单事件");
        System.out.println("==================================================");
        ZiDingYiCaiDanShiJian zidingyi2=new ZiDingYiCaiDanShiJian(ZiDingYiCaiDanShiJianEnum.VIEW);
        zidingyi2.setToUserName("阿迪");
        zidingyi2.setFromUserName("啥苏");
        zidingyi2.setCreateTime(System.currentTimeMillis());
        zidingyi2.setEventKey("事件KEY值，与自定义菜单接口中KEY值对应");
        zidingyi2.showXml();

    }
}
