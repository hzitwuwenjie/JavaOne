package com.jc02.lichenxi;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日
 */
public class Test12 {
    public static void main(String[] args) {

        System.out.println("1");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 10 - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("3");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9 - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("4");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9 - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("5");
        for (int i = 0; i < 16 / 2; i++) {

            for (int j = 0; j < 16 / 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 17; i++) {
            System.out.print("*");
        }
            System.out.println();

            System.out.println("6");
            for (int i = 1; i <= 10; i++) {
                for (int j = 10 - i - 1; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (int i = 1; i <= 10 - 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * (10 - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
