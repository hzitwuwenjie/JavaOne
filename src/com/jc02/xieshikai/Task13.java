package com.jc02.xieshikai;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 18:53
 * |  @description   使用双重for循环打印图形
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task13 {

    public static void main(String[] args) {
        shape6();
        }
    public static void shape1() {
        for (int i = 1; i <= 9; i++) {//i:行  j:列
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void shape2() {//i:行  j:列
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 9; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void shape3() {//i:行  j:列
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void shape4() {//i:行  j:列
        for (int i = 1; i <=9; i++) {
            for(int j=1;j<=9-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void shape5(String[] args) {


    }

    public static void shape6() {//i:行  j:列
        for (int i = 1; i <=9; i++) {
            for(int j=1;j<=9-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 9; i >=1; i--) {
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*(i-1)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
