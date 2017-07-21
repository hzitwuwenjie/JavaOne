package com.jc02.fjx;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 9:22
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        Random num = new Random();
        int b = num.nextInt(10);
        System.out.println("请输入四位数字：");
        int i = j.nextInt();
        if (i < 1000 || i > 9999) {
            System.out.println("数字输入错误，请输入四位数：");
            return;
        } else  {
            System.out.println("你输入的数字是：" + i);
            System.out.println("中奖号码为：" +b);
            if (i / 100 % 10 ==b) {
                System.out.println("死肥宅，你中奖啦");
            } else {
                System.out.println("还想要奖品，没有，滚");
            }
        }
    }
}
