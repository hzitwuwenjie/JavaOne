package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月22日 - 8:27
 * |  @description   双重循环打印三角形
 * +---------------------------------Oooo---------------------------------------+
 */
public class Looplx {
    public static void san1(){
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
    public static void san2(){
        for (int i = 10; i >0 ; i--) {
            for (int l = 0; l < 10-i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
    public static void san3(){
        for (int i = 1; i <10 ; i++) {
            for (int l = 0; l <10- i; l++) {
                System.out.print(" ");
            }
            for (int j = 10; j > 10-i; j--) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
    public static void san4(){
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j <10- i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    public static void san5(){
        for (int i = 0; i <9 ; i++) {
            for (int j = 0;j <9- i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int k = 0; k <(2*i-1); k++) {
                System.out.print(" ");
            }
            if(i>0)
            {System.out.print("*");}
            System.out.println("");

        }
        for (int g = 0; g <10 ; g++) {
            System.out.print("* ");
        }

    }
    public static void san6(){
        for (int i = 1; i <10 ; i++) {
            for (int l = 0; l <10- i; l++) {
                System.out.print(" ");
            }
            for (int j = 10; j > 10-i; j--) {
                System.out.print("*");

            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int m = 10; m >0 ; m--) {
            for (int n = 0; n < 10-m; n++) {
                System.out.print(" ");
            }
            for (int o = 0; o <(2*m-1); o++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        System.out.println("\n第一个三角形");
        san1();
        System.out.println("\n第二个三角形");
        san2();
        System.out.println("\n第三个三角形");
        san3();
        System.out.println("\n第四个三角形");
        san4();
        System.out.println("\n第五个三角形");
        san5();
        System.out.println("\n第六个三角形");
        san6();
    }
}