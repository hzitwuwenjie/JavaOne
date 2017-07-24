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
 * |　@create 2017年07月22日 - 9:18
 * |    @description   　　　使用for循环打印图形2
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi12 {
    public static void main(String[] args) {
            for (int i = 1; i <10 ; i++) {
                for (int a = 1; a <=i ; a++) {
                    System.out.print(" ");
                }
                for (int a = 1; a<=10-i ; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

