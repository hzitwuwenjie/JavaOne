package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 19:22　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Test15 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {

            for (int j = 9; j >= i; j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

