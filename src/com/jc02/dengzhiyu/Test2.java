package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月20日 - 17:23　                    
 *  |    @description   练习二　　　　　　　　　　　　　                                                              　
 */

public class Test2 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int count=2;
        double d=(a*2+b+c)*0.8;
        int  f=(int)d/100;
        System.out.println("*******消费单*******");

        System.out.println("购买物品\t\t单价\t\t个数\t\t金额");
        System.out.println("黄金战衣\t\t"+a+"\t\t\t"+count+"\t\t\t¥"+a*count );
        System.out.println("死亡之弩    "+"¥570    "+"1      "+"¥570");
        System.out.println("水杖        "+"¥320    "+"1      "+"320");

        System.out.println("折扣：      "+"8折    ");
        System.out.println("消费总金额  "+"¥"+d );
        System.out.println("实际交费    "+"¥1500");
        System.out.println("找钱        "+"￥"+(1500-d));
        System.out.println("本次消费购物所获的积分：   "+f);
//
    }
}

