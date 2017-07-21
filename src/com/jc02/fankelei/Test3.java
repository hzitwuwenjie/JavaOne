package com.jc02.fankelei;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 9:43
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("请输入一个四位数参与抽奖：");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();//输入数字
        Random rand = new Random();
        int c = rand.nextInt(10);//产生0-10随机数
        if (b < 1000 || b > 9999) {
            System.out.println("输入数字不符合范围 ");
            return;
        } else {
            System.out.println("您输入的抽奖数字为：" + b);
            if (b / 100 % 10 == c) {
                System.out.println("恭喜中奖");
            } else {
                System.out.println("谢谢惠顾");
            }
        }
    }
}






