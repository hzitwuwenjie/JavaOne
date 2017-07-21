package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 15:29　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        System.out.println("魔界饰品分发系统");
        System.out.println("*****************************");
        System.out.println("1.会员信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.装备返点");
        System.out.println("4.注销");
        System.out.println("*****************************");
        Scanner input = new Scanner(System.in);
        int a=0;
        System.out.print("请选择，输入数字：");

        do{
            a=input.nextInt();
            if (a < 1 || a > 4) {
                System.out.println("输入错误，请重新输入数字");
            }

        }
        while (a<1||a>4);

    }
}


