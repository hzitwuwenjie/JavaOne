package com.jc02.zengjing;



import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 10:12
 * |  @description   switch练习
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统");
        System.out.println("\t\t\t\t\t1. 登陆系统");
        System.out.println("\t\t\t\t\t2. 退出");
        System.out.println("***************************");
        System.out.println("请选择输入数字：");
        int a =i.nextInt();
        switch (a){
            case 1:
                System.out.println("\t\t\t魔界饰品分发系统");
                System.out.println("***************************");
                System.out.println("\t\t\t\t\t1. 会员信息管理");
                System.out.println("\t\t\t\t\t2. 购物结算");
                System.out.println("\t\t\t\t\t3. 装备返点");
                System.out.println("\t\t\t\t\t4. 注销");
                System.out.println("请继续输入数字：");
                int b=i.nextInt();
                switch (b){
                    case 1:
                        System.out.println("\t\t\t魔界饰品分发系统");
                        System.out.println("***************************");
                        System.out.println("\t\t\t\t\t1. 显示所有会员信息");
                        System.out.println("\t\t\t\t\t2. 添加会员信息");
                        System.out.println("\t\t\t\t\t3. 修改会员信息");
                        System.out.println("\t\t\t\t\t4. 查询会员信息");
                        break;
                    case 2:
                        System.out.println("还未开放，敬请期待");
                        break;
                    case 3:
                        System.out.println("\t\t\t魔界饰品分发系统");
                        System.out.println("***************************");
                        System.out.println("\t\t\t\t\t1. 幸运大放送");
                        System.out.println("\t\t\t\t\t2. 幸运抽奖");
                        System.out.println("\t\t\t\t\t3. 生日问候");
                        break;
                    case 4:
                        System.out.println("已退出");
                        break;
                    default :
                        System.out.println("未选择指定的选项");
                        break;
                }
                break;
            case 2:
                System.out.println("已退出系统");
                break;
            default :
                System.out.println("未选择指定的选项");
                break;
        }

    }
}