package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017年07月20日 - 10:23
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LX22 {
    public static void main(String[] args) {
        System.out.println("输出三角形");
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 10; i >0 ; i--) {
            for (int l = 0; l < 10-i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j <= 8 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
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
        int i = 0;
        int j = 0;
        int row = 10;
        int col = 10;
        System.out.println("");
        while (true) {
            if (i > row && j > col) {
                break;
            }
            if (i < row && j > col) {
                System.out.println("");
                j = 0;
                i++;
                continue;

            }
            if (i < row && j < col) {
                if (j > i && j < row - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            j++;

        }
    }
}