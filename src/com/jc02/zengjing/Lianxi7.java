package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 15:16
 * |  @description   密码错误循环输入
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统");
        System.out.println("***************************");
        System.out.println("\t\t\t\t\t1. 会员信息管理");
        System.out.println("\t\t\t\t\t2. 购物结算");
        System.out.println("\t\t\t\t\t3. 装备返点");
        System.out.println("\t\t\t\t\t4. 注销");
        System.out.println("***************************");
        System.out.print("请输入你的选项：");
        int a =input.nextInt();
        while(a<1||a>4) {
            System.out.print("输入错误，请继续输入：");
            a = input.nextInt();
        }
        }

    }
