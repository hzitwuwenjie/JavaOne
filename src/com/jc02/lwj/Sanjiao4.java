package com.jc02.lwj;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 8:16
 * |    @description   1
 * +---------------------------------Oooo---------------------------------------+
 */
public class Sanjiao4 {
    public static void main(String[] args) {
        int x= 9;
        for (int i = 1; i <= x; i++) {                    // 外层循环控制输出的行数
            for (int j = 1; j <= x - i; j++) {            // j表示输出的空格数，其空格数=总行数-1
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {        // k表示输出的字符"*",其个数=当前行数*2-1
                System.out.print("*");
            }
            System.out.println();                // 每输出一行就换行一次
        }
    }
}
