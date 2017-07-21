package com.jc02.yangyoufeng;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 9:22
 * |    @description   传出随机数判断是否中奖
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in

        );
        Random rand = new Random(10);
        System.out.println("请输入一个四位数：\t");
        int i = input.nextInt();
        int num = rand.nextInt(10);
        if (i < 1000 || i > 9999) {
            System.out.println("您输入的数字不正确,请重新输入：");
            return;//终止方法
        }
        else
        {
            System.out.println("您输入的数字是：" + i);
            System.out.println("随机数字是：" + num);
        }
        if (i / 100 % 10 == num)
        {
            System.out.println("恭喜您中奖了");
        } else {
            System.out.println("很遗憾您未中奖。谢谢参与");
        }
    }
}
