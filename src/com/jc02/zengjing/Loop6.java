package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 19:53
 * |  @description   双重循环打印三角形6
 * +---------------------------------Oooo---------------------------------------+
 */
public class Loop6 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int l = 0; l <10- i; l++) {
                System.out.print(" ");
            }
            for (int j = 10; j > 10-i; j--) {
                System.out.print("*");

            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int m = 10; m >0 ; m--) {
            for (int n = 0; n < 10-m; n++) {
                System.out.print(" ");
            }
            for (int o = 0; o <(2*m-1); o++) {
                System.out.print("*");

            }
            System.out.println("");

        }


    }
}