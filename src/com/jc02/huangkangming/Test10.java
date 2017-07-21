package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:38
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String binary="";
        System.out.println("请输入一个十进制数字");
        int a=in.nextInt();
        while(a!=0){
           binary+=a%2;
            a/=2;
        }
        for (int i =binary.length()-1; i>=0 ; i--) {
            System.out.print(binary.charAt(i));
        }
    }
}