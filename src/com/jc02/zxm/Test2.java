package com.jc02.zxm;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 17:27
 * |    @description   第二个输出消费单程序
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2 {
    public static void main(String[] args) {
        final  double i=1500;
        int a=245;
        int b=570;
        int c=320;
        int count=2;
        double t=(a*2+b+c)*0.8;
        int d=((int)t/100)*3;
        System.out.println("**********消费单***************");
        System.out.println("购买物品   单价   个数   金额");
        System.out.println("黄金战衣\t" +"￥"+a +"\t"+count+"\t" +a*count);
        System.out.println("死亡之弩\t"+"￥"+b +"\t"+1+"\t" +a*1);
        System.out.println("水仗  \t\t"+"￥"+c +"\t"+1+"\t" +c*1 +"\n");
        System.out.println("折扣        8折 ");
        System.out.println("消费总金额:"+t );
        System.out.println("实际交费:" +i );
        System.out.println("找钱:"+(i-t));
        System.out.println("本次购物所得积分为:"+d);
    }
}

