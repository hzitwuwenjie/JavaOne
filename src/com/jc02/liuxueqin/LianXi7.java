package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 15:22　                    
 *  |    @description   用户输入错误可以重复输入直到输入正确才停止程序　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi7 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("\t魔界饰品分发系统");
        System.out.println("********************************");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("********************************");
        System.out.println("请选择，输入数字：");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        while(i>4){
            System.out.println("输入错误，请重新输入数字：");
            int j=input.nextInt();
            }
        if(i>=1||i<=4){
            System.exit(0);
        }

    }
}

