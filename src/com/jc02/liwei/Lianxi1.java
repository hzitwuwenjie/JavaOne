package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟是爸爸　　　　　　                                                                 　|
 * |　@author 不要问爸爸，爸爸不知道                                                   |
 * |　@create 2017年07月21日 - 11:48
 * |    @description   4位数随机中奖
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入4位随机数字：");
        int b = a.nextInt();
        Random c = new Random();
        int t = c.nextInt(10);
        if (b < 1000 || b > 9999) {
            System.out.println("你输入的数字不在范围之内，请输入1000到9999之间的数字");
            return;
        } else {
            System.out.println("你输入的数字中百位是：" + b/100%10);
            System.out.println("中奖数字是：" +t);
            if (b / 100 % 10 == c.nextInt()) {
                System.out.println("恭喜你中奖了");
            } else {
                System.out.println("谢谢参与");
            }
        }

    }
}
