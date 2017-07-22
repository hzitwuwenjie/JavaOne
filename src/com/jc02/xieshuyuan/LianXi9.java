package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 14:23
 * |    @description   输入提示，可重复输入
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi9 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("魔界饰品分发系统");
        System.out.println("-----------------------------------");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("-----------------------------------");
        System.out.print("请选择，输入数字:");
        Scanner input1=new Scanner(System.in);
        int flag=input1.nextInt();
        while(flag>4 || flag<1){
            System.out.print("输入错误，请重新输入数字：");
            Scanner input2=new Scanner(System.in);
            flag=input2.nextInt();
        }
        LianXi9.switch1(flag);
    }
    public static void switch1(int a1) {
        switch (a1) {
            case 1:
                System.out.println("\t\t魔界饰品分发系统");
                System.out.println("* * * * * * ** * * * * * * * * * * * * * * * *");
                System.out.println("\t\t\t1.显示所有会员信息");
                System.out.println("\t\t\t2.添加会员信息");
                System.out.println("\t\t\t3.修改会员信息");
                System.out.println("\t\t\t4.查询会员信息");
                System.out.println("* * * * * * *  * * * * * * * * * * * * * * * *");
                System.out.println("请输入数字来选择");
                Scanner input3=new Scanner(System.in);
                int flag=input3.nextInt();
                while(flag>4 || flag<1){
                    System.out.print("输入错误，请重新输入数字：");
                    Scanner input=new Scanner(System.in);
                    flag=input.nextInt();
                }
                LianXi9.switch3(flag); break;
            case 2:
                System.out.println("购物已结算好，请自己查询！"); break;
            case 3:
                System.out.println("装备返点中"); break;
            case 4:
                System.out.println("已注销！"); break;
        }
    }
    public static void switch3(int a2) {
        switch (a2) {
            case 1:
                System.out.println("所有的会员信息如下："); break;
            case 2:
                System.out.println("请输入你要添加的会员信息 "); break;
            case 3:
                System.out.println("请输入你要修改的会员信息"); break;
            case 4:
                System.out.println("请输入你要查询的会员信息"); break;
        }
    }
}
