package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:31
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_10
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个十进制的数字:");
        int num = input.nextInt();
        String flag = "";
        while(num!=0)
        {
            flag=flag+num%2;
            num=num/2;
        }

        System.out.print("该数字转换成二进制为:");

        for (int i = flag.length()-1; i >= 0; i--) {
            System.out.print(flag.charAt(i));
        }

    }
}
