package com.jc02.pengmeiqian;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月20日 - 17:25
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Test2 {
    public static void main(String[] args){
        int a=245;
        int b=570;
        int c=320;
        double d;
        int e=1500;
        int cost;
        double discount;
        cost=2*a+b+c;
        discount=0.8*cost;
        d=(int)discount%100*3;
        System.out.println("************消费单************");
        System.out.println("购买物品"+"\t"+"单价"+"\t"+"个数"+"\t"+"金额");
        System.out.println("黄金战衣"+"\t"+"￥"+a+"\t"+" 2"+"\t"+"    "+ 2*a);
        System.out.println("死亡之弩"+"\t"+"￥"+b+"\t"+" 1"+"\t"+"    "+ b);
        System.out.println("水仗    "+"\t"+"￥"+c+"\t"+" 1"+"\t"+"    "+ c);
        System.out.println("折扣:"+"\t"+"8折");
        System.out.println("消费金额"+"￥"+ discount);
        System.out.println("实际交费"+"￥"+e);
        System.out.println("找钱"+"￥"+(e-discount));
        System.out.println("本次购物所获得积分是："+"\t"+d);

    }
}
