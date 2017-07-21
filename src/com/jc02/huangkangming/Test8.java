package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:15
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("\t\t\t\t魔界饰品分发系统");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("\t\t\t\t\t\t1.会员管理系统");
        System.out.println("\t\t\t\t\t\t2.购物结算");
        System.out.println("\t\t\t\t\t\t3.装备返点");
        System.out.println("\t\t\t\t\t\t4.注销");

        System.out.print("请选择，输入数字:");
        int a=in.nextInt();
        while(a>4){
            System.out.print("输入错误，请重新输入数字:");
            a=in.nextInt();
        }
    }
}