package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月20日 - 17:26　                    
 *  |    @description   消费单　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class ConsumptionCard {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int g=b*2;
        int c=320;
        double d=(a*2+b+c)*0.8;
        int e=(int)(d/100)*3;
        int f=1500;
        double h=f-d;
        System.out.println("********"+"*消费单*"+"**************");
        System.out.println("购买物品  "+"单价    "+"个数  "+"金额");
        System.out.println("黄金战衣  "+a+"元"+"    "+2+"    "+g+"元");
        System.out.println("死亡之奴  "+b+"元"+"    "+1+"    "+b+"元");
        System.out.println("水仗      "+c+"元"+"    "+1+"    "+c+"元");
        System.out.println("消费总金额： "+d+"元");
        System.out.println("实际交费： "+f+"元");
        System.out.println("找钱： "+h+"元");
        System.out.println("本次购物所获的积分是："+e);
    }

}
