package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟是爸爸　　　　　　                                                                 　|
 * |　@author 不要问爸爸，爸爸不知道                                                   |
 * |　@create 2017年07月21日 - 11:50
 * |    @description   魔界饰品系统
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统\t\t\t\t");
        System.out.println("1.登录系统\n\n"+"2.退出\n");
        System.out.println("**********************************");
        System.out.println("请选择，请输入数字：");

        int b=a.nextInt();

        switch(b) {
            case 1:
                Scanner c=new Scanner(System.in);
                System.out.println("\t\t\t魔界饰品分发系统\t\t\t\t");
                System.out.println("1.会员信息管理\n"+"2.购物结算\n"+"3.装备返点\n"+"4.注销\n");
                System.out.println("**********************************");
                System.out.println("请选择，请输入数字：");
                int d=c.nextInt();
                switch (d){
                    case 1:
                        System.out.println("1.显示所有会员信息\n"+"2.添加会员信息\n"+"3.修改会员信息\n"+"4.查询会员信息\n");
                        System.out.println("**********************************");
                        System.out.println("请选择，请输入数字：");
                        break ;
                    case 2:
                        System.out.println("1.幸运大放送\n"+"2.幸运抽奖\n"+"3.生日问候\n");
                        System.out.println("**********************************");
                        System.out.println("请选择，请输入数字：");
                        break;
                    case 3:
                        System.out.println("垃圾装备\n");
                        break;
                    case 4:
                        System.out.println("快滚蛋\n");
                        break;

                }
                break;
        }
    }
}
