package com.jc02.xiewenqiang;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月20日 - 17:19
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */

public class Test2 {

    public static void main(String[] args) {
        int pricea = 245;
        int priceb = 570;
        int pricec = 320;
        int num1 = 2;
        int num2 = 1;
        int num3 = 1;
        int discount = 8;
        int actual = 1500;
        double sum;

        System.out.println("***********消费单************");
        System.out.println("购买物品\t单价\t个数\t金额");
        System.out.println("黄金战衣\t￥" + pricea + '\t' + num1 + "\t\t￥" + (pricea * num1));
        System.out.println("死亡之奴\t￥" + priceb + '\t' + num2 + "\t\t￥" + (priceb * num2));
        System.out.println("水杖\t\t￥" + pricec + '\t' + num3 + "\t\t￥" + (pricec * num3));
        System.out.println();

        System.out.println("折扣:\t" + discount + "折");
        sum = (pricea * num1 + priceb * num2 + pricec * num3) * discount / 10;
        System.out.println("消费总金额\t￥" + sum);
        System.out.println("实际交费\t￥" + actual);
        System.out.println("找钱\t\t￥" + (actual - sum));
        System.out.println("本次购物所获的积分是：" + (int) sum / 100 * 3);
    }

}

