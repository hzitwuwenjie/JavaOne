package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 10:12　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("魔界饰品分发系统");
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        System.out.println("*****************************");
        Scanner a=new Scanner(System.in);
        System.out.println("请选择，输入数字：");
        int b=a.nextInt();
        switch (b) {
            case 1:
            System.out.println("魔界饰品分发系统");
            System.out.println("*****************************");
            System.out.println("1.会员信息管理");
            System.out.println("2.购物结算");
            System.out.println("3.装备返点");
            System.out.println("4.注销");
            System.out.println("*****************************");
                Scanner c = new Scanner(System.in);
                System.out.println("请选择，输入数字：");
                int d = c.nextInt();
                switch (d) {
                    case 1:
                        System.out.println("*****************************");
                        System.out.println("1.显示所有会员信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.修改会员信息");
                        System.out.println("2.查询会员信息");
                        System.out.println("*****************************");
                        break;
                    case 2:
                        System.out.println("*****************************");
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        System.out.println("*****************************");
                        break;
                }
                break;
            case 2:
            System.out.println("已经退出系统");
                break;



        }
    }
}

