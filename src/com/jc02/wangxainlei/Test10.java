package com.jc02.wangxainlei;

import java.util.Scanner;

public class Test10 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
       int number=0;
        System.out.println("请输入一个十进制数字");
        number=input.nextInt();
        String bin="";
        while(number!=0){
            bin=bin+number%2;
            number=number/2;
        }
     for(int i=bin.length()-1;i>=0;i--){

         System.out.print(bin.charAt(i));
     }

    }
}
