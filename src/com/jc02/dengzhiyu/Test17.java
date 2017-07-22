package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 19:35　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Test17 {
    public static void main(String[] args) {
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


    }
}