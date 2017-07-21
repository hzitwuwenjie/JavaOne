package com.jc02.wjm;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 9:54
 * |  @description   月份
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exerciser4 {
    public static void main(String[] args) {
        System.out.println("*******魔界饰品分发系统**********");
        System.out.println("\t\t1.登录系统");
        System.out.println("\t\t2.退出");
        Scanner a=new Scanner(System.in);
        System.out.println("请选择，输入数字:");
        int b=a.nextInt();
        switch(b){
            case 1:
                System.out.println("*******魔界饰品分发系统**********");
                System.out.println("\t\t1.会员信息管理");
                System.out.println("\t\t2.购物结算");
                System.out.println("\t\t3.装备返点");
                System.out.println("\t\t4.注销");
                Scanner c=new Scanner(System.in);
                System.out.println("请选择，输入数字:");
                int d=c.nextInt();
                switch (d){
                    case 1:
                        System.out.println("1.显示所有会员信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.修改会员信息");
                        System.out.println("4.查询会员信息");
                        break;
                    case 2:
                        System.out.println("1.心愿大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        break;
                    case 3:
                        System.out.println("此功能尚待完善");
                        break;
                    case 4:
                        System.out.println("成功退出");
                        break;
                    default:
                        System.out.println("只有1-4功能 ");
                        break;

                }
            case 2:
                System.out.println("成功退出！");
                break;
            default:
                System.out.println("按1和2");
                break;


        }
    }
}
