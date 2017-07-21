package com.jc02.xiewenqiang;

import java.util.Random;
import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 9:46
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("请输入一个四位整数：");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int a = input.nextInt();
        int num = rand.nextInt(10);
        if (a < 1000 || a > 9999) {
            System.out.println("输入数字不符合范围 ");
            return;
        } else {
            System.out.println("您输入的抽奖数字为：" + a);
            System.out.println("产生的随机数字为：" + num);
            if (a / 100 % 10 == num) {
                System.out.println("恭喜中奖");
            } else {
                System.out.println("谢谢参与");
            }
        }

    }
}




