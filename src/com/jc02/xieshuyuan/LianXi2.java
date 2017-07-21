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
public class LianXi2{
    public static void main(String[] args) {
        int menu1=0, menu2=0, menu3=0, menu4=0;
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("\t\t\t1.系统登录");
        System.out.println("\t\t\t2.退出");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("请输入数字来选择");
        Scanner input1=new Scanner(System.in);
        menu1=input1.nextInt();
        switch (menu1){
            case 1:
                System.out.println("\t\t魔界饰品分发系统");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("\t\t\t1.会员信息管理");
                System.out.println("\t\t\t2.购物结算");
                System.out.println("\t\t\t3.装备返点");
                System.out.println("\t\t\t4.注销");
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("请输入数字来选择");
                Scanner input2=new Scanner(System.in);
                menu2=input2.nextInt();
                switch (menu2){
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
                        menu3=input3.nextInt();
                        switch (menu3){
                            case 1:
                                System.out.println("所有的会员信息如下："); break;
                            case 2:
                                System.out.println("请输入你要添加的会员信息"); break;
                            case 3:
                                System.out.println("请输入你要修改的会员信息"); break;
                            case 4:
                                System.out.println("请输入你要查询的会员信息"); break;
                        } break;
                    case 2:
                        System.out.println("购物已结算好，请自己查询！"); break;
                    case 3:
                        System.out.println("装备返点中"); break;
                    case 4:
                        System.out.println("已注销！"); break;
                }
                break;
            case 2:
                System.out.println("已退出");  break;
        }
    }
}
