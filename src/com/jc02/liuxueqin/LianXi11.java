package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 18:15　                    
 *  |    @description   各种循环　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class LianXi11 {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        */
        /*
        for (int i = 1; i <=9 ; i++) {
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=9;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /*
        for (int i = 1; i <=9 ; i++) {
            for (int j = 9; j >0; j--) {
                if (j <=i) {
                    System.out.print("*\t");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        /*
        for (int i = 1; i<=9; i++) {
            for (int k = 8; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

    }
}