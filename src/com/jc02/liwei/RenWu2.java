package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/20.
 */

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟是爸爸　　　　　　                                                                 　|
 * |　@author 不要问爸爸，爸爸不知道                                                   |
 * |　@create 2017年07月20日 - 18:14
 * |    @description   为什么所有人都要叫爸爸饶命呢
 * +---------------------------------Oooo---------------------------------------+
 */
public class RenWu2 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int d=a*2;
        int e=b*1;
        int f=c*1;
        double g=(d+e+f)*0.8;
        int h=1500;
        double i=h-g;

        int  j=(int)g/100;



        System.out.println("*****************消费单*******************");
        System.out.println("购买物品"+"    "+"单价"+"    "+"个数"+"    "+"金额");
        System.out.println("黄金战衣"+"    "+"￥"+a+"    "+2+"    "+"￥"+d);
        System.out.println("死亡之弩"+"    "+"￥"+b+"    "+1+"    "+"￥"+e);
        System.out.println("水    杖"+"    "+"￥"+c+"    "+1+"    "+"￥"+f);
        System.out.println("                       ");
        System.out.println("折扣:"+"    "+"8折");
        System.out.println("消费总金额:"+"    "+g);
        System.out.println("实际交费:"+"    "+h);
        System.out.println("折找钱"+"    "+i);
        System.out.println("本次购物所获的积分:"+"    "+j);
    }
}
