package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 9:53
 * |    @description   熟悉Switch语句编写登录菜单选项
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi3 {
    public static void sw1tch1(int a1) {
        switch (a1) {
            case 1:
                System.out.println("\t\t魔界饰品分发系统");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("\t\t\t1.会员信息管理");
                System.out.println("\t\t\t2.购物结算");
                System.out.println("\t\t\t3.装备返点");
                System.out.println("\t\t\t4.注销");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("请输入数字来选择");
                Scanner input2 = new Scanner(System.in);
                int menu2 = input2.nextInt();
                LianXi3.sw1tch2(menu2); break;
            case 2:
                System.out.println("已退出"); break;
        }
    }
    public static void sw1tch2(int a2) {
        switch (a2) {
            case 1:
                System.out.println("\t\t魔界饰品分发系统");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("\t\t\t1.显示所有会员信息");
                System.out.println("\t\t\t2.添加会员信息");
                System.out.println("\t\t\t3.修改会员信息");
                System.out.println("\t\t\t4.查询会员信息");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("请输入数字来选择");
                Scanner input3=new Scanner(System.in);
                int menu3=input3.nextInt();
                LianXi3.sw1tch3(menu3); break;
            case 2:
                System.out.println("购物已结算好，请自己查询！"); break;
            case 3:
                System.out.println("装备返点中"); break;
            case 4:
                System.out.println("已注销！"); break;
        }
    }

    public static void sw1tch3(int a3) {
        switch (a3) {
            case 1:
                System.out.println("所有的会员信息如下："); break;
            case 2:
                System.out.println("请输入你要添加的会员信息"); break;
            case 3:
                System.out.println("请输入你要修改的会员信息"); break;
            case 4:
                System.out.println("请输入你要查询的会员信息"); break;
        }
    }
    public static void main(String[] args) {
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("\t\t\t1.系统登录");
        System.out.println("\t\t\t2.退出");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("请输入数字来选择");
        Scanner input1=new Scanner(System.in);
        int menu1=input1.nextInt();
        switch (menu1){
            case 1:
                LianXi3.sw1tch1(menu1); break;
            case 2:
                System.out.println("已退出");  break;
        }
    }
}
