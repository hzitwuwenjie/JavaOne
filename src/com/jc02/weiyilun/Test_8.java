package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:15
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_8
{
    public static void main(String[] args) {
        System.out.println("魔界饰品分发系统");
        System.out.println("********************************");
        System.out.println("1.会员管理系统");
        System.out.println("2.购物结算");
        System.out.println("3.装备返点");
        System.out.println("4.注销");
        System.out.println("********************************");
        Scanner input = new Scanner(System.in);
        System.out.print("请选择，输入数字:");
        int num =0;
        while(num<1 || num>4)
        {
             num = input.nextInt();
            System.out.print("输入错误请重新输入数字:");


        }
    }
}
