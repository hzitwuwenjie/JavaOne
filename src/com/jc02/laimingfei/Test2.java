package com.jc02.laimingfei;

/**
 * Created by ${赖明飞} .
 */
public class Test2 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        double d=(a*2+b+c)*0.8;
        int f= (int)(d/100)*3;
        System.out.println("*******"+"消费单"+"******");
        System.out.println("购买物品" +"   单价"+ "  个数"+ " 金额");
        System.out.println("黄金战衣"+ "   $245"+ "   2"+ "   $490");
        System.out.println("死亡之奴"+ "   $570 " + "  1"+"   $570");
        System.out.println("水杖" + "      $320"+"    1"+"   $320");
        System.out.println("            ");
        System.out.println("折扣 "+ " 8折  ");
        System.out.println("消费总金额 "+ "  $"+d);
        System.out.println("实际交费" +"     $1500");
        System.out.println("找钱 "+ "      $"+(1500-d));
        System.out.println("本次购物所获积分是"+ f);


    }
}
