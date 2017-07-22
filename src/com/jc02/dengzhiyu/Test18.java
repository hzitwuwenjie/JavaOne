package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 19:51　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Test18 {
    public static void main(S10tring[] args) {
        for (int i = 1; i <=10; i++) {

            for (int j = 10; j >= i; j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 8; i >=1; i--) {
            for (int j = 1; j >= i; j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}

