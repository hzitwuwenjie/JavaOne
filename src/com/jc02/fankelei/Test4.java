package com.jc02.fankelei;
import java.util.Scanner;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 10:11
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("\t\t1.系统登录");
        System.out.println("\t\t2.退出");
        System.out.println("*******************************************");
        System.out.print("\t\t输入一个数字:");
        int s=input.nextInt();
        switch(s) {
            case 1:
                System.out.println("\t\t1.会员信息管理");
                System.out.println("\t\t2.购物结算");
                System.out.println("\t\t3.装备返点");
                System.out.println("\t\t4.注销");
                System.out.println("************************************************");
                System.out.print("输入一个数字");
                int d=input.nextInt();
                switch (d){
                    case 1:
                        System.out.println("\t\t1.显示所有会员信息");
                        System.out.println("\t\t2.添加会员信息");
                        System.out.println("\t\t3.修改会员信息");
                        System.out.println("\t\t4.查询会员信息");
                        System.out.println("****************************************");
                        break;
                    case 2:
                        System.out.println("\t\t1.幸运大放送");
                        System.out.println("\t\t2.幸运抽奖");
                        System.out.println("\t\t3.生日问候");
                        System.out.println("****************************************");
                        break;
                    case 3:
                        System.out.println("\t\t功能维护中");
                        break;
                    case 4:
                        System.out.println("\t\t注销成功");
                        break;
                    default:
                        System.out.println("输入的数字无效");
                        break;
                }
                break;
            case 2:
                System.out.println("成功退出");
                break;
            default:
                System.out.println("输入的不是一个有效数字");
                break;
        }

    }
}
