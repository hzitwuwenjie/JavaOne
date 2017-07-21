package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 10:12
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi2 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t魔界饰品分发系统");
        System.out.println("\t\t\t\t\t\t\t\t\t\t1.登录系统");
        System.out.println("\t\t\t\t\t\t\t\t\t\t2.退出");
        System.out.println("************************************************");
        Scanner input = new Scanner(System.in);
        System.out.print("请选择，输入数字");
        int num = input.nextInt();
        switch(num) {
            case 1:
                System.out.println("\t\t\t\t魔界饰品分发系统");
                System.out.println("************************************************");
                switch (num){
                    case 1:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t1.会员信息系统");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t2.购物结算");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t3.装备返点");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t4.注销");
                        System.out.print("请选择，输入数字");
                        int num1 = input.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("\t\t\t\t会员信息系统");
                                System.out.println("************************************************");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t1.显示所有会员信息");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t2.添加会员信息");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t3.修改会员信息");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t4.查询会员信息");
                                break;
                            case 2:
                                System.out.println("\t\t\t\t购物结算");
                                System.out.println("************************************************");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t1.幸运大放送");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t2.幸运抽奖");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t3.生日问候");
                                break;
                        }
                }
                break;
            case 2:
                System.out.println("退出系统");
                break;
        }

    }
}
