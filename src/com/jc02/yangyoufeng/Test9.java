package com.jc02.yangyoufeng;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 15:26
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("魔界饰品分发系统");
        System.out.println("-----------------------------------");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("-----------------------------------");
        System.out.print("请输入数字：");
        Scanner input = new Scanner(System.in);
        int flag = input.nextInt();
        while (flag > 4 || flag < 1) {
            System.out.print("输入错误，请重新输入数字：");
            flag=input.nextInt();
        }
    }
}