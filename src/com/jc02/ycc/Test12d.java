package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 19:28
 * |    @description   双重for 循环
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12d {
    public static void main(String[] args) {
            // 输出等腰三角形图形
        int row= 9;
        for (int i = 1; i <= row; i++) {                    // 外层循环控制输出的行数
            for (int j = 1; j <= row - i; j++) {            // j表示输出的空格数，其空格数=总行数-1
                System.out.print(" ");
            }
            for (int x = 1; x <= i * 2 - 1; x++) {        // x表示输出的字符"*",其个数=当前行数*2-1
                System.out.print("*");
            }
            System.out.println();                // 每输出一行就换行一次
        }
    }
}