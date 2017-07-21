package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 15:20
 * |  @description  输入错误则重新输入
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("***************************************");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4注销");
        System.out.println("***************************************");
        System.out.print("请选择，输入数字：");
        i = input.nextInt();
        while(i<1 || i>4){
            System.out.print("输入错误，请重新输入数字：");
            i = input.nextInt();
        }
    }
}
