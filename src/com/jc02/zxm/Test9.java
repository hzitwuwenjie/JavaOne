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
 * |　@create 2017年07月21日 - 15:23　                           |
 * |    @description   重复输入，提示错误　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0;
        System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
        System.out.println("*******************************");
        System.out.println("\t\t\t 1,会员信息管理 \t\t\t\t");
        System.out.println("\t\t\t 2,购物结算 \t\t\t\t");
        System.out.println("\t\t\t 3,装备返点 \t\t\t\t");
        System.out.println("\t\t\t 4,注销 \t\t\t\t");
        System.out.println("*******************************");
        System.out.println("请输入选择数字:");
        i=input.nextInt();

        while(i>4 || i<1)
        {

            System.out.println("输入错误，请重新输入数字:");
            i=input.nextInt();
        }
        switch (i){
            case 1:
                System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
                System.out.println("*******************************");
                System.out.println("\t\t\t 1,查询会员信息 \t\t\t\t");
                System.out.println("\t\t\t 2,添加员信息 \t\t\t\t");
                System.out.println("\t\t\t 3,会修改员信息\t\t\t\t");
                System.out.println("\t\t\t 4,删除会员信息 \t\t\t\t");
                System.out.println("*******************************");
                break;
            case 2:
                System.out.println("暂无购物结算功能");
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


    }
}

