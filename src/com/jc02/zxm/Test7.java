package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 11:57　                           |
 * |    @description   键盘读入正负数，计算个数　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数据：");
        int i = 0;
        int f = 0;
        int z = 0;
        do {
            i=input.nextInt();

            if (i < 0) {
                f++;
            }
            if (i > 0) {
                z++;
            }
        }
        while (i != 0);
        {

            System.out.println("正数的个数为" + z);
            System.out.println("负数的个数为" + f);
        }


    }
}