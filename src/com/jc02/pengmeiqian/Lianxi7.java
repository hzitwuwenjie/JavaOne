package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 15:19
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi7 {
    public static void main(String[] args) {
        int i=0;
        System.out.println("\t\t\t\t魔界饰品分发系统");
        System.out.println("\t\t\t\t\t\t\t\t1.会员信息系统");
        System.out.println("\t\t\t\t\t\t\t\t2.购物结算");
        System.out.println("\t\t\t\t\t\t\t\t3.装备返点");
        System.out.println("\t\t\t\t\t\t\t\t4.注销");
        System.out.println("************************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("请选择，输入数字");
        do {
            i=input.nextInt();//
            if (i < 1 || i > 4) {
                System.out.println("输入错误，请重新输入数字");
            }
        }while(i < 1 || i > 4);

    }
}
