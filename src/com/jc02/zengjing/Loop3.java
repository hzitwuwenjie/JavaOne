package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 19:01
 * |  @description   双重循环打印三角形3
 * +---------------------------------Oooo---------------------------------------+
 */
public class Loop3 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int l = 0; l <10- i; l++) {
                System.out.print(" ");
            }
            for (int j = 10; j > 10-i; j--) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}