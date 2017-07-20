package com.jc02.zoudongping;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 17:28
 * |    @description   黄金战衣
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2 {
    public static void main(String[] args){
        int a=245;
        int b=570;
        int c=320;
        double d;
        int e;
        double f;
        d=(a*2+b+c)*0.8;
        e=(int)d/100*3;
        f=1500-d;
        System.out.println("＊＊＊＊＊＊*消费单*＊＊＊＊＊＊");
        System.out.println("购买物品   单价   个数   金额");
        System.out.println("黄金战役  ￥"+a+"     "+2+"    ￥"+a*2);
        System.out.println("死亡之怒  ￥"+b+"     "+1+"    ￥"+b);
        System.out.println("水杖      ￥"+c+"     "+1+"    ￥"+c);
        System.out.println("折扣           "+8+"折");
        System.out.println("消费总金额     ￥"+d);
        System.out.println("实际交费       ￥"+1500);
        System.out.println("找钱           ￥"+f);
        System.out.println("本次购物所获的积分是："+e);
    }
}