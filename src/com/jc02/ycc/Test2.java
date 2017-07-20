package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月20日 - 17:24
 * |    @description   打印购物小票
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2 {
    public static void main(String[] args) {
        int a=245; // 黄金战衣单价
        int b=570;// 死亡之弩单价
        int c=320;//冰杖单价
        int d=a*2+b+c;//消费总金额
        int x=3*(d/100);//计算消费积分
        int y=1500;//实际交费
        double z=(y-d*0.8);//找钱


        System.out.println("***********消费单***********");
        System.out.println("购买物品   单价  个数   金额");
        System.out.println("黄金战衣   "+a+"      2"+"    "+a*2);
        System.out.println("死亡之弩   "+b+"      1"+"    "+b);
        System.out.println("冰杖       "+c+"      1"+"    "+c);
        System.out.println("                                   ");
        System.out.println("折扣:        8折"   );
        System.out.println("消费总金额" +"   " + d);
        System.out.println("实际交费"   +"     " + y);
        System.out.println("找钱"       +"         "+ z);
        System.out.println("本次购物所获的积分是："+x);
    }
}
