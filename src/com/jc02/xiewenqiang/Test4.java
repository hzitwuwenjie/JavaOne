package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 10:11
 * |  @description   菜单
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        show1();
        int i = input.nextInt();
        switch (i) {
            case 1:
                show2();
                i = input.nextInt();
                switch (i) {
                    case 1:
                        show3();
                        i = input.nextInt();
                        switch (i) {
                            case 1:
                                show4();
                                break;
                        }
                        break;
                }
            case 2:
                break;
            default:
                System.out.println("输入无效");
                break;
        }
    }

    private static void show4() {
        System.out.println("\t\t\t1.幸运大转盘");
        System.out.println("\t\t\t2.幸运抽奖");
        System.out.println("\t\t\t3.生日问候");
    }

    private static void show3() {
        System.out.println("******************************************************************");
        System.out.println("\t\t\t1.显示所有会员信息");
        System.out.println("\t\t\t2.添加会员信息");
        System.out.println("\t\t\t3.修改会员信息");
        System.out.println("\t\t\t4.查询会员信息");
        System.out.println("******************************************************************");
        System.out.print("请选择输入数字：");
    }

    private static void show2() {
        System.out.println("\t\t\t魔界饰品分发系统");
        System.out.println("******************************************************************");
        System.out.println("\t\t\t1.会员信息管理");
        System.out.println("\t\t\t2.购物结算");
        System.out.println("\t\t\t3.装备返点");
        System.out.println("\t\t\t4.注销");
        System.out.println("******************************************************************");
        System.out.print("请选择输入数字：");
    }

    private static void show1() {
        System.out.println("\t\t\t魔界饰品分发系统");
        System.out.println("\t\t\t1.系统登录");
        System.out.println("\t\t\t2.退出");
        System.out.println("******************************************************************");
        System.out.print("请选择输入数字：");
    }
}

