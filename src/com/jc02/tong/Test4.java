package com.jc02.tong;

import java.util.Scanner;

/**
 * 　　  　  　     ***********
 * 　　　 　  　    \\　=_=　//
 * 　　　　　  　   (　 .@.@　)
 * +-------****-----( _ )-----****--------------------------------------------+
 * |　@author Tong　　　　　　                                                 |
 * |　@author 江西财经大学                                                     |
 * |　@create 2017年07月21日 - 10:12
 * |  @description   switch运用
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("魔界饰品分发系统");
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        System.out.println("***********************");
        System.out.println("请输入你的选择");
        System.out.println("魔界饰品分发系统");
        System.out.println("***********************");

        int number=input.nextInt();
        switch(number){
            case 2:
                break;
            case 1:
                System.out.println("1.会员信息管理");
                System.out.println("2.购物结算");
                System.out.println("3.装备返点");
                System.out.println("4.注销");
            case 3:
                System.out.println("1.会员信息管理");
                break;
            case 4:
                System.out.println("2.购物结算");
                break;
            case 5:
                System.out.println("3.装备返点");
                break;
            case 6:
                System.out.println("4.注销");
                break;

        }

    }
}

