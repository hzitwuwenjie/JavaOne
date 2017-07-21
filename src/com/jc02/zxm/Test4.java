package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 9:55　                           |
 * |    @description   switch　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
        System.out.println("\t\t\t\t 1,登录 \t\t\t\t");
        System.out.println("\t\t\t\t 2,退出 \t\t\t\t");
        System.out.println("*******************************");
        System.out.println("请您选择菜单选项数字：");
        int i=input.nextInt();
        switch (i) {
            case 1:
                System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
                System.out.println("*******************************");
                System.out.println("\t\t\t 1,会员信息管理 \t\t\t\t");
                System.out.println("\t\t\t 2,购物结算 \t\t\t\t");
                System.out.println("\t\t\t 3,装备返点 \t\t\t\t");
                System.out.println("\t\t\t 4,注销 \t\t\t\t");
                System.out.println("*******************************");
                System.out.println("请您选择菜单选项数字：");
                int j=input.nextInt();
                switch (j){
                    case 1:
                        System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
                        System.out.println("*******************************");
                        System.out.println("\t\t\t 1,查询会员信息 \t\t\t\t");
                        System.out.println("\t\t\t 2,添加员信息 \t\t\t\t");
                        System.out.println("\t\t\t 3,会修改员信息\t\t\t\t");
                        System.out.println("\t\t\t 4,删除会员信息 \t\t\t\t");
                        System.out.println("*******************************");
                        break;
                    case 3:
                        System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
                        System.out.println("*******************************");
                        System.out.println("\t\t\t 1,幸运大放送 \t\t\t\t");
                        System.out.println("\t\t\t 2,幸运抽奖 \t\t\t\t");
                        System.out.println("\t\t\t 3,生日问候 \t\t\t\t");
                        System.out.println("*******************************");
                        break;
                    case 4:
                        System.out.println("注销");
                        break;
            }
                break;
            case 2:
                System.out.println("系统退出");
                break;
        }
    }
}

