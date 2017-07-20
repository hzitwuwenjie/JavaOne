package com.jc02.weiyilun;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 14:31
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_2
{
    public static void main(String[] args) {

//
        int z=1500;
        int a= 245;
        int b= 570;
        int c=320;
        double d=0.8*(a*2+b+c);


        System.out.println("****************消费单***************");
        System.out.println("购买物品      单价      个数     金额");
        System.out.println("黄金战衣\t" +  "￥"+a+"\t\t"+ 2+ "\t\t￥"+a*2);
        System.out.println("死亡之弩\t" +  "￥"+b+"\t\t"+1+ "\t\t￥"+b);
        System.out.println("水杖\t\t"   +  "￥"+c+"\t\t"+1+"\t\t￥"+c);
        System.out.println("-----------------------------------");
        System.out.println("折扣\t     8折                 ");
        System.out.println("消费总金额\t"+ "￥"+d            );
        System.out.println("实际交费\t" + "￥"+z               );
        System.out.println("找钱\t\t"    + "￥"+(z-d)            );
        System.out.println("本次购物所获得的积分："+ (int)(d/100*3));
    }
}
