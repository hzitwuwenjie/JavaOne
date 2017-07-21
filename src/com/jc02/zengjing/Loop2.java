package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 18:53
 * |  @description   双重循环打印三角形2
 * +---------------------------------Oooo---------------------------------------+
 */
public class Loop2 {
    public static void main(String[] args) {
        for (int i = 10; i >0 ; i--) {
            for (int l = 0; l < 10-i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}