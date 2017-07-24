package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 16:30
 * |    @description   　　　输入错误可以重复输入到正确为止
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi7 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统\t\t\t\t");
        System.out.println("**********************************");
        System.out.println("1.账号信息管理\n"+"2.购物结算\n"+"3.装备返点\n"+"4.注销");
        System.out.println("**********************************");
        System.out.println("请选择，输入数字：");
        int b;
        do {
            b=a.nextInt();
            System.out.println("输入错误，请重新输入数字");
        }while (b>4);
    }
}
