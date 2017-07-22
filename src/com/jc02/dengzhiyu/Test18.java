package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 19:51　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Test18 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {

            for (int j = 10; j >= i; j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        int row=9;
        for (int i = 1; i <=row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=2*(row-i)+1;k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

