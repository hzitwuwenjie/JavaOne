package com.jc02.qinjiajun;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 15:44
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();
        String s="";
        while(num!= 0)
        {
           s+=num%2;
            num/=2;
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}