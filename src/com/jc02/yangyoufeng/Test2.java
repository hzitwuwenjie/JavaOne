package com.jc02.yangyoufeng;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 17:36
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2 {
    public static void main(String[] args) {
        int a = 245;
        int b = 570;
        int c = 320;
        double d = (a * 2 + b + c) * 0.8;
        int f = (int) d;
        int g = f / 100 * 3;
        int h = 1500;
        double i = h - d;
        System.out.println("*******消费单*******");
        System.out.println("购买物品   单价    个数   余额 ");
        System.out.println("黄金战袍   ￥245    2     490 ");
        System.out.println("死亡之奴   ￥570    1     570   ");
        System.out.println("水杖       ￥320    1     320  ");
        System.out.println("折扣：8折    ");
        System.out.println("消费总额" + d);
        System.out.println("实际交费" + h);
        System.out.println("找钱" + i);
        System.out.println("本次购物所获积分是" + g);
    }
}