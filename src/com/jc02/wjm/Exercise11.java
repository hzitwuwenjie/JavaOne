package com.jc02.wjm;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:40
 * |  @description   二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise11 {
    public static void main(String[] args) {
        int a;
        String b="";
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制数字");
        a=input.nextInt();
        while (a!=0){

            b=b+a%2;
            a=a/2;
        }
        for(int i=b.length()-1;i>=0;i--)
        System.out.print(b.charAt(i));
    }
}
