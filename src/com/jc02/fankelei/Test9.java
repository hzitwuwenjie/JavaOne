package com.jc02.fankelei;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:19
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("********************************************U");
        System.out.println("\t\t1.会员信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("************************************************");
        System.out.print("输入一个数字");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        while(num<1||num>4)
        {

            System.out.print("输入错误，请重新输入数字");
            num=input.nextInt();
        }
    }
}
