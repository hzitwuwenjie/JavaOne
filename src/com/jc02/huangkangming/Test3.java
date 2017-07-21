package com.jc02.huangkangming;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 9:01
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int b = random.nextInt(10);
        System.out.println("请输入一个4位整数");
        int a = in.nextInt();
        if (a < 1000 || a > 9999) {
            System.out.println("输入不正确,请输入一个1000到9999的整数");
            return;
        } else {
            System.out.println("您输入的数字是："+a);
            System.out.println("随机数字是："+b);
            if ((a / 100) % 10 == b) {
                System.out.println("恭喜您中奖了，获得外星人电脑一台！");
            } else {
                System.out.println("谢谢参与");
            }
        }

    }
}