package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 19:14
 * |  @description   双重循环打印三角形5
 * +---------------------------------Oooo---------------------------------------+
 */
public class Loop5 {
    public static void main(String[] args) {
        for (int i = 0; i <9 ; i++) {
            for (int j = 0;j <9- i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int k = 0; k <(2*i-1); k++) {
                System.out.print(" ");
            }
            if(i>0)
            {System.out.print("*");}
            System.out.println("");

            }
        for (int g = 0; g <10 ; g++) {
            System.out.print("* ");
        }
    }


}