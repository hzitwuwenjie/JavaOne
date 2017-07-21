package com.jc02.xiewenqiang;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 17:58
 * |  @description   打印三角形
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test13 {
    public static void main(String[] args) {
        triangle1();
        //triangle2();
        //triangle3();
        //triangle4();
        //triangle5();
        //triangle6();
    }

    private static void triangle1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 9; j > 10 - i; j--) {
                System.out.print(" ");
            }
            for (int k = 10; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle3() {
        for (int i = 1; i <= 9; i++) {
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 9; j >= 10 - i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle4() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            for (int m = 1; m < i; m++)
                System.out.print("*");
            System.out.println();
        }
    }
    private static void triangle5(){
        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j <(8 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int b = 0; b < 2 * i - 1; b++) {
                System.out.print(" ");
            }
            if (i==0) {}
            else{
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<17;i++){
            System.out.print("*");
        }
    }


    private static void triangle6() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = 10; i < 19; i++) {
            for (int j = 0; j < i - 9; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 37 - 2 * i; j++) {

                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }
}

