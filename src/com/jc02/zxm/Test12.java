package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 16:20　                           |
 * |    @description   数字转换成二进制　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;//输入一个十进制数
        int a;//存储余数
        int sum=0;//存放和
        int k=1;//控制位数
        System.out.println("请输入一个数字：");
        num=input.nextInt();
        while(num!=0)
        {
            a=num%2;//求余数
            num=num/2;//求商
            sum=sum+a*k;//求和
            k=k*10;//改变位数

        }
        System.out.println("这个数字的二进制数为："+sum);
    }
}

