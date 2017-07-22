package com.jc02.tong;


import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制的数");
        int num=input.nextInt();
        String bin="";

        //String msg= Integer.toBinaryString(num);

        //System.out.println(msg);
        while(num!=0){

          //  System.out.println(num % 2);

            bin=bin+num %2;
            num=num/2;
        }
        for (int i =bin.length()-1;i>=0;i--){
            System.out.println(bin.charAt(i));
        };


    }
}
