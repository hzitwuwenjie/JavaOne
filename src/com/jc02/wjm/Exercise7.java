package com.jc02.wjm;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 11:44
 * |  @description   计数
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise7 {
    public static void main(String[] args) {
        int zs=0,fs=0,a;
        Scanner b=new Scanner(System.in);
        do{
            a=b.nextInt();
            if(a<0)  fs=fs+1;
            else if (a>0) zs=zs+1;
       }while (a!=0);
        System.out.println("正数个数:"+zs+"负数个数："+fs);
    }
}
