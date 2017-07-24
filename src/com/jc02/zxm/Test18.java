package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 19:44　                           |
 * |    @description   四个三角拼接　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test18 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9-i; j++)
                System.out.print("\t");
            for (int k = 0; k < 2*(i+1)-1; k++)
                System.out.print("*\t");
            System.out.println();
        }
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < m+1; n++)
                System.out.print("\t");
            for (int l = 0; l < 17-2*m; l++)
                System.out.print("*\t");
            System.out.println();
        }

    }
}

