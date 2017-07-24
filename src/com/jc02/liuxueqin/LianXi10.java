package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 18:15　                    
 *  |    @description   十进制转换成二进制　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        String b="";
        System.out.println("请输入一个十进制数字");
        a=input.nextInt();
        //b=Integer.toBinaryString(a);
        System.out.println(b);
        while(a!=0){
            b=b+a%2;
            a=a/2;
        }
        for(int i=b.length()-1;i>=0;i--){
            System.out.print(b.charAt(i));
        }
    }
}
