package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 15:49
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi9 {
    public static void main(String[] args) {
        int num=0;
        String bin="";
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制的数：");
        num=input.nextInt();
        while (num !=0){
            bin=bin+num%2;
            num=num/2;

        }
        for(int i=bin.length()-1;i>=0;i--){
            System.out.print(bin.charAt(i));
        }
    }
}
