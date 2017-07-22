package com.jc02.lwj;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 19:21
 * |    @description   1
 * +---------------------------------Oooo---------------------------------------+
 */
public class Sanjiao2 {
    public static void main(String[] args) {


    int i;
    int j;
        for ( i = 0; i<=10; i++) {
            for ( j = 0; j<=10 ; j++) {
                if(j>i)
                { System.out.print("*");}
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("\t");

        }
    }
}
