package com.jc02.lwj;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 17:36
 * |    @description   2
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lwjtest2 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        double d=(a*2+b+c)*0.8;
        int e=(int)d/100*3;
        int f=1500;
        int g=f-(int)d;
        System.out.println("**********消费单**********");
        System.out.println("购买物品     单价     个数      金额");
        System.out.println("黄金战衣     "+a+"      "+2+"        " +a*2);
        System.out.println("黄金战衣     "+b+"      "+1+"        " +b);
        System.out.println("黄金战衣     "+c+"      "+1+"        " +c);

        System.out.println("消费总金额："+d);
        System.out.println("折扣：      8折");
        System.out.println("实际交费："+f);
        System.out.println("找钱："+g);
        System.out.println("本次购物所获的积分："+e);
    }

}
