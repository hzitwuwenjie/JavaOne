package com.jc02.lichenxi;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个十进制的数字：");
        int num = input.nextInt();
        String bin="";
        while(num!=0)
        {
            bin=bin+num%2;
            num=num/2;
        }
        //将一个字符串从右往左输出
        for(int i=bin.length()-1;i>=0;i--)
        {
            System.out.print(bin.charAt(i));
        }
    }
}
