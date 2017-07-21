package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 10:12
 * |  @description   从登录菜单跳转到主菜单
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("\t\t\t\t1、登录系统");
        System.out.println("\t\t\t\t2、退出");
        System.out.println("***********************************************");
        System.out.print("请选择，输入数字: ");
        int i = input.nextInt();
        System.out.println();
        switch(i){
            case 1:
                System.out.println("\t\t魔界饰品分发系统");
                System.out.println("***********************************************");
                System.out.println("\t\t\t\t1、会员信息管理\n");
                System.out.println("\t\t\t\t2、购物结算\n");
                System.out.println("\t\t\t\t3、装备返点\n");
                System.out.println("\t\t\t\t4、注销\n");
                System.out.println("***********************************************");
                System.out.println("请选择，输入数字：");
                int j = input.nextInt();
                switch(j){
                    case 1:
                        System.out.println("\t\t\t\t1、显示所有会员信息");
                        System.out.println("\t\t\t\t2、添加会员信息");
                        System.out.println("\t\t\t\t3、修改所有会员信息");
                        System.out.println("\t\t\t\t4、查询所有会员信息");
                        break;
                    case 2:
                        System.out.println("\t\t\t\t1、幸运大放送");
                        System.out.println("\t\t\t\t2、幸运抽奖");
                        System.out.println("\t\t\t\t3、生日问候");
                        break;
                    case 3:
                        System.out.println("\t\t\t\t暂无装备");
                        break;
                    case 4:
                        System.out.println("谢谢惠顾！");
                        System.exit(0);
                        break;
                }
                break;
            case 2:
                System.out.println("谢谢惠顾！");
                break;
            default:
                System.out.println("没有该选项");
                break;
        }

    }
}
