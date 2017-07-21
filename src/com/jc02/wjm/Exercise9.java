package com.jc02.wjm;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:20
 * |  @description   氤氲
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("*******魔界饰品分发系统**********");
        System.out.println("\t\t1.账号信息管理系统");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        Scanner input=new Scanner(System.in);
        System.out.println("请选择，输入数字:");
        int b=input.nextInt();
        while(b>4||b<1) {
            System.out.println("输入错误，请重新输入：");
            b=input.nextInt();
        }
    }


}
