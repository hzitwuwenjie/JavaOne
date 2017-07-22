package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 19:58
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12b {
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
            System.out.println();
        }


    }
}
