package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 9:53
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);


        System.out.println("\t\t\t\t\t\t1.登录系统");
        System.out.println("\t\t\t\t\t\t2.退出");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

        System.out.print("请选择，输入数字:");
        int a=in.nextInt();

        switch(a){
            case 1:
                System.out.println("\t\t\t\t魔界饰品分发系统");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("\t\t\t\t\t\t1.会员管理系统");
                System.out.println("\t\t\t\t\t\t2.购物结算");
                System.out.println("\t\t\t\t\t\t3.装备返点");
                System.out.println("\t\t\t\t\t\t4.注销");
            break;

            case 2:
                System.out.println("成功退出系统");
                break;
        }
        if(a==1) {
            System.out.println("请输入选项菜单");
            int b = in.nextInt();
            switch (b) {
                case 1:
                    System.out.println("\t\t\t\t\t\t1.显示所有会员信息");
                    System.out.println("\t\t\t\t\t\t2.添加会员信息");
                    System.out.println("\t\t\t\t\t\t3.修改会员信息");
                    System.out.println("\t\t\t\t\t\t4.查询会员信息");
                    break;
                case 2:
                    System.out.println("\t\t\t\t\t\t1.幸运大放送");
                    System.out.println("\t\t\t\t\t\t2.幸运抽奖");
                    System.out.println("\t\t\t\t\t\t3.生日问候");
                    break;
                default:
                    System.out.println("");
            }

        }
    }

}
