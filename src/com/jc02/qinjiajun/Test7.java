package com.jc02.qinjiajun;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 13:55
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int sum=0;
        int sum1=0;
        int num1;
        for(int i=1;i<1000;i++) {
            do {
               num1=num.nextInt();
                if (num1 >= 0) {
                    sum++;
                } else {
                    sum1++;
                }
            } while (num1 != 0);
            System.out.println("正数" + sum);
            System.out.println("负数" + sum1);
        }

    }


}