package com.jc02.laicuinan;

/**
 * Created by Administrator on 2017/7/20.
 */
public class test3 {
    public static void main(String[] args) {
        final  double i=1500;
        int a=245;
        int b=570;
        int c=320;
        double t=(a*2+b+c)*0.8;
        int d=((int)t/100)*3;
        System.out.println("**********消费单***************");
        System.out.println("购买物品   单价   个数   金额");
        System.out.println("黄金战衣   ￥245   2     ￥490");
        System.out.println("死亡之弩   ￥570   1     ￥570");
        System.out.println("水仗       ￥320   1     ￥320");
        System.out.println("\t");
        System.out.println("折扣        8折 ");
        System.out.println("消费总金额:"+t );
        System.out.println("实际交费:" +i );
        System.out.println("找钱:"+(i-t));
        System.out.println("本次购物所得积分为:"+d);
    }
}
