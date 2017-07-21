package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 9:53
 * |    @description   switch语句
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("摩羯饰品分发系统");
        System.out.println("1.登录");
        System.out.println("2.退出");
        System.out.println("*****************************");
        int i = in.nextInt();
        switch(i) {
            case 1:
                System.out.println("*****************************");
                System.out.println("魔界饰品分发系统");
                System.out.println("1.会员信息管理");
                System.out.println("2.购物结算");
                System.out.println("3.装备返点");
                System.out.println("4.注销");
                System.out.println("*****************************");
                int a = in.nextInt();
                switch (a){
                    case 1:
                        System.out.println("*****************************");
                        System.out.println("摩羯饰品分发系统");
                        System.out.println("1.显示所有会员信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.修改会员信息");
                        System.out.println("4.查询会员信息");
                        System.out.println("*****************************");
                        int b = in.nextInt();
                        switch (b){
                            case 1: break;
                            case 2: break;
                            case 3: break;
                            case 4: break;
                        }
                        break;
                    case 2:
                        System.out.println("*****************************");
                        System.out.println("摩羯饰品分发系统");
                        System.out.println("你消费了888元");
                        System.out.println("*****************************");
                        break;
                    case 3:
                        System.out.println("*****************************");
                        System.out.println("摩羯饰品分发系统");
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        System.out.println("*****************************");
                        int c = in.nextInt();
                        switch (c){
                            case 1: break;
                            case 2: break;
                            case 3: break;
                        }
                        break;
                    case 4:
                        System.out.println("*****************************");
                        System.out.println("摩羯饰品分发系统");
                        System.out.println("1.登录");
                        System.out.println("2.退出");
                        System.out.println("*****************************");
                        break;
                }
                 break;
            case 2:
                System.out.println("*****************************");
                System.out.println("退出成功！");
                System.out.println("*****************************");
                break;
        }
    }
}