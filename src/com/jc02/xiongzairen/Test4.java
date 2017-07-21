package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 10:12
 * |    @description   幸运单
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("魔界饰品分发系统\t\t");
        System.out.println("\t\t\t1.登录系统");
        System.out.println("\t\t\t2.退出");
        System.out.println("**********************");
        System.out.println("请选择，输入数字：");
        int j=input.nextInt();


        switch(j){
            case 1:
                System.out.println("魔界饰品分发系统");
                System.out.println("**********************");
                System.out.println("1.会员信息管理");
                System.out.println("2.购物结算");
                System.out.println("3.装备返点");
                System.out.println("4.注销");
                System.out.println("请输入数字：");
                int a=input.nextInt();
                switch (a){
                    case 1:
                        System.out.println("1.显示所有会员信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.更改会员信息");
                        System.out.println("4.删除会员信息");
                        break;
                    case 2:
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        break;

                }

                break;
            case 2:
            break;
            default:
                System.out.println("输入错误数字，请输入1或者2");

        }


    }
}
