package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 19:46
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12f {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入行数：");
        int row=input.nextInt();

        if (row >= 1) { // 判断传入的行数
            int x, y;
            for (x = 1; x <= row; x++) {            // 先输出上半部分的正三角形
                for (y = 1; y <= row - x; y++)        // 控制左边输出的空格数
                    System.out.print(" ");
                for (y = 1; y <= 2 * x - 1; y++)        // 控制输出的"#"数
                    System.out.print("*");
                System.out.println();            // 每输出一行就换行一次
            }
            for (x = 1; x <= row; x++) {            // 输出下半部分的正三角形
                for (y = 1; y <= x; y++)            // 控制左边输出的空格数，与上半部分正好相反
                    System.out.print(" ");
                for (y = 1; y <= 2 * (row - x) - 1; y++)    // 控制输出的"#"数
                    System.out.print("*");
                System.out.println(); // 每输出一行就换行一次
            }
        } else {
            System.out.println("您输入的行数错误，请重新输入！！！");
        }
    }
}

