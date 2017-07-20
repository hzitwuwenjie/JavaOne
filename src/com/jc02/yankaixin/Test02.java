package com.jc02.yankaixin;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月20日 - 17:24
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 245;
        int b = 570;
        int c = 320;
        int a_sum = 2;
        int b_sum = 1;
        int c_sum = 1;
        int a_result = a*a_sum;
        int b_result = b*b_sum;
        int c_result = c*c_sum;
        double result = (a_result+b_result+c_result)*0.8;
        double actual_money = 1500;
        int point = (int)(result/100)*3;
        System.out.println("********消费单********" );
        System.out.println("购买物品    " + "单价     " + "个数     " + "金额");
        System.out.println("黄金战衣    " + "￥" + a + "    " + a_sum + "        ￥" + a_result);
        System.out.println("死亡之弩    " + "￥" + b + "    " + b_sum + "        ￥" + b_result);
        System.out.println("水仗        " + "￥" + c + "    " + c_sum + "        ￥" + c_result);
        System.out.println();
        System.out.println("折扣：     " + "8折");
        System.out.println("消费总金额  ￥" + result);
        System.out.println("实际交费    ￥" + actual_money);
        System.out.println("找钱      ￥" + (actual_money-result));
        System.out.println("本次购物所获的积分是: " + point);
    }
}
