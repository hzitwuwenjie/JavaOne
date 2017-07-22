package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 19:50
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
*/
public class Test12a {
    public static void main(String[] args) {
        int row=9;
        for (int i = 1; i <= row; i++) {
            for (int x = 1; x <= i; x++)
                System.out.print("*");
            for (int y = i; y != 0; y--)
                System.out.print(" ");
            System.out.println(); 				// 每输出一行就换行一次
        }


    }
}
