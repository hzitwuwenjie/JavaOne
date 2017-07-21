package com.jc02.qinjiajun;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 10:11
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);

        System.out.println("\t魔界饰品分发系统\t");
        System.out.println("\t1.登录系统");
        System.out.println("\t2.退出");
        System.out.println("请选择：");
        int num1 = num.nextInt();
        switch (num1)
        {
            case 1:
                System.out.println("\t1.会员信息管理");
                System.out.println("\t2.购物结算");
                System.out.println("\t3.装备返点");
                System.out.println("\t4.注销");
                System.out.println("请选择：");
                int num2 = num.nextInt();
                switch (num2){
                    case 1:
                        System.out.println("\t1.显示所有会员信息");
                        System.out.println("\t2.添加会员信息");
                        System.out.println("\t3.修改会员信息");
                        System.out.println("\t3.查询会员信息");
                        break;
                    case 2:
                        System.out.println("\t1.幸运大放送");
                        System.out.println("\t2.幸运抽奖");
                        System.out.println("\t2.生日问候");
                     break;
                    default:
                        System.out.println("数字无效");
                        break;
                }
                break;
            case 2:
                System.out.println("2.退出");
                break;
            default:
                System.out.println("数字无效");
                break;

        }
    }
}