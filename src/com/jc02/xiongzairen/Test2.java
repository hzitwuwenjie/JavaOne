package com.jc02.xiongzairen;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 17:25
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2 {
    public static void main(String[] args) {
        int a=1500;
        int b=245;
        int c=570;
        int d=320;
        double sum=(b*2+c+d)*0.8;
        double blannce=a-sum;
        int grade=(int)(sum/100)*3;
        System.out.println("************消费单****************");
        System.out.println("购买物品  "+"单价  "+"个数  "+"金额");
        System.out.println("黄金战衣  "+b+"     "+"2  "+   b*2);
        System.out.println("死亡之弩  "+c+"     "+"1  "+   c*1);
        System.out.println("水杖      "+d+"     "+"1  "+   d*1);
        System.out.println("折扣   "+" 8折");
        System.out.println("消费总金额 "+sum);
        System.out.println("实际交费   "+a);
        System.out.println("找钱       "+blannce);
        System.out.println("本次所获积分是   "+grade);


    }
}
