package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月20日 - 17:26
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2 {
    public static void main(String[] args) {

        int d =245;
        int e =570;
        int f =320;
        double num =(2*d+e+f)*0.8;
        int mon =1500;
        double zl =mon-num;
        int g=(int)(num/100*3);
        System.out.println("*************消费单*************");
        System.out.println("购买物品   单价   个数   金额");
        System.out.println("黄金圣衣   "+d +"     2"+"     "+d*2);
        System.out.println("死亡之弩   "+e +"     1"+"     "+e);
        System.out.println("水杖       "+f +"     2"+"     "+f);
        System.out.println("   ");
        System.out.println("折扣：        8折");
        System.out.println("消费总金额：  "+num);
        System.out.println("实际交费：    "+mon);
        System.out.println("找钱：        "+zl);
        System.out.println("本次购物获得的积分是：  "+g);

    }
}