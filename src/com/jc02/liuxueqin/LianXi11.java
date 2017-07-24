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

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("  ");
            }
            if (i != 9) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    if (k == 1 || k == 2 * i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        /*
        int row=10;
        for (int i = 1; i <=row ; i++) {
            for (int k = row-1; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=row-1 ; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*(row-i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
    }
}