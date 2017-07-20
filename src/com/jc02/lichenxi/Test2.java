package com.jc02.lichenxi;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李晨曦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 17:26
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
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
        System.out.println("*******消费单*******");
        System.out.println("购买物品"+" 单价"+"个数"+"金额");
        System.out.println("黄金战衣"+"￥245"+" 2"+"￥490");
        System.out.println("死亡之弩"+"￥570"+" 1"+"￥570");
        System.out.println("水杖   "+"￥320"+" 1"+"￥320");
        System.out.println("折扣："+"    8折");
        System.out.println("消费总金额"+"￥"+e);
        System.out.println("实际交费"  +"￥1500");
        System.out.println("找钱      "+"￥"+f);
        System.out.println("积分      "+"￥"+g);

    }
}
