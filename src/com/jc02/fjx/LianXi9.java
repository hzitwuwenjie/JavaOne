package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 16:22
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("请输入一个十进制数字：");
        int a = num.nextInt();
       String bin="";
        while (a!=0){
            bin=bin+a%2;
            a=a/2;
        }
       for(int i=bin.length()-1;i>=0;i--) {
           System.out.print(bin.charAt(i));
       }
    }
}
