package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 14:09
 * |    @description   　　　循环结构练习----do while
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
        int c = 0;
        int d = 0;
        do {
             b= a.nextInt();
            if (b > 0)
                c++;
           else if (b < 0)
                d++;
        } while (b!=0);
        System.out.println("正整数个数"+c);
        System.out.println("负整数个数"+d);
    }
}
