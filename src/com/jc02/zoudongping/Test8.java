package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:49
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z=0;
        int f=0;
        int num=0;
        do {
            num = in.nextInt();
            if (num < 0)
                f++;
            else if (num > 0)
                z++;
        }while(num!=0);
        System.out.println("正数个数：\t"+z);
        System.out.println("负数个数：\t"+f);
    }
}