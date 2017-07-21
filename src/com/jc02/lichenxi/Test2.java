package com.jc02.lichenxi;

/**
 Created by 李晨曦 on 2017/7/20.
 */
public class Test2 {
    public static void main(String[] args){
        int a = 245;
        int b = 570;
        int c = 320;
        int d = a*2+b+c;
        double e = d*0.8;
        double f = 1500-e;
        int g = (int)(e/100) * 3;
        int count1 = 2;
        int count2 = 1;
        int count3 = 1;
        System.out.println("*******消费单*******");
        System.out.println("购买物品\t"+" 单价\t"+"个数\t"+"金额\t");
        System.out.println("黄金战衣\t"+"￥"+a+"\t"+count1+"\t\t"+"￥"+count1*a);
        System.out.println("死亡之弩\t"+"￥"+b+"\t"+count2+"\t\t"+"￥"+count2*b);
        System.out.println("水杖\t\t"+"￥"+c+"\t"+count3+"\t\t"+"￥"+count3*c);
        System.out.println("折扣\t"+"\t8折");
        System.out.println("消费总金额\t"+"￥"+e);
        System.out.println("实际交费\t"+"￥1500");
        System.out.println("找钱\t\t"+"￥"+f);
        System.out.println("积分\t\t"+"￥"+g);

    }
}
