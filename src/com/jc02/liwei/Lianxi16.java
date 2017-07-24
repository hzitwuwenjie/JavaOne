package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/22.
 */

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月22日 - 9:49
 * |    @description   　　　使用for循环打印图形6
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi16 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9-i; j++)
                System.out.print(" ");
            for (int k = 0; k < 2*(i+1)-1; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < m+1; n++)
                System.out.print(" ");
            for (int l = 0; l < 17-2*m; l++)
                System.out.print("*");
            System.out.println();
        }

    }
}
