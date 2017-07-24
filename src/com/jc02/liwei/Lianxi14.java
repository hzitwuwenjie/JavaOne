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
 * |　@create 2017年07月22日 - 9:25
 * |    @description   　　　使用For循环打印图形4
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi14 {
    public static void main(String[] args) {
        int row=9;
        for (int i = 0; i <=row ; i++) {
                for (int a = 1; a <=row-i ; a++) {
                    System.out.print(" ");
                }
                for (int a = 1; a<=2*i-1 ; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

