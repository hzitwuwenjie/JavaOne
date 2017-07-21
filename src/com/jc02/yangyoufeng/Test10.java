package com.jc02.yangyoufeng;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 15:42
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int maxcount = 0;
        int mincount = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("请输入第" + i + "位顾客的年龄");
            int age = input.nextInt();
            if (age > 30) {
                maxcount++;
            } else {
                mincount++;
            }
            System.out.println("30岁以上的比例为:" + (maxcount / 10.0 * 100) + "%");
            System.out.println("30岁以上的比例为:" + (mincount / 10.0 * 100) + "%");
        }
    }
}
