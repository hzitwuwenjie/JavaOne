package com.jc02.weiyilun;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 9:22
 * |  @description   描述中奖号码
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_3
{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        Random j = new Random();
        int a = j.nextInt(10);
        int num = i.nextInt();
        if (num>9999 || num<1000)
        {
            System.out.println("你输入的不是一个四位数");
            return;
        }
        else

        {
            System.out.println("您输入的幸运数字为"+num);
            System.out.println("您输入的随机数为"+a);
            if (num/100%10==a)
                System.out.println("恭喜您中奖了");
            else
            System.out.println("谢谢参与");

        }

    }
}
