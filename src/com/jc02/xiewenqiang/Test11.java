package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 15:33
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制数字:");
        int num = input.nextInt();

        while (num != 0) {
            str = str + num % 2;
            num = num / 2;
        }
        System.out.print("该数字转换成二进制为:");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
