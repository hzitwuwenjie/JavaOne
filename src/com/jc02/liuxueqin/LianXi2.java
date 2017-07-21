package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 10:12　                    
 *  |    @description   switch的练习　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi2 {
    public static void main(String[] args) {
        System.out.println("********魔界饰品分布系统********");
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        System.out.println("********************************");
        Scanner input=new Scanner(System.in);
        System.out.println("请选择，输入第一个数字：");
        int i=input.nextInt();
        System.out.println("请选择，输入第二个数字：");
        int j=input.nextInt();
        System.out.println("********************************");
        switch (i){
            case 1:
                System.out.println("1.会员信息管理系统");
                System.out.println("2.购物结算");
                System.out.println("3.装备返点");
                System.out.println("4.注销");
                System.out.println("********************************");
                switch (j){
                    case 1:
                        System.out.println("1.显示所有会员的信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.修改会员信息");
                        System.out.println("4.查询会员信息");
                        break;
                    case 2:
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        break;
                    default:
                        System.out.println("您输入的数字不在范围内。");
                        break;
                }
                break;
            case 2:
                System.out.println("退出系统");
                break;
            default:
                System.out.println("输入错误。");
                break;
        }
        System.out.println("********************************");
    }
}
