package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 15:41
 * |  @description   二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a =0;
        String flag ="";
        String xu="";
        System.out.println("请输入想要转换的值");
        int num =input.nextInt();
        do{
            a =num%2;
            flag =flag+a;
            num =num/2;
        }while(num !=0);
        char[] charArray = flag.toCharArray();
        for(int i=charArray.length-1; i>=0; i--){
            xu=xu+charArray[i];

        }
        System.out.println(xu);
    }
}