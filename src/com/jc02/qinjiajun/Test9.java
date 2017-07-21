package com.jc02.qinjiajun;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 14:47
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("\t魔界饰品分发系统\t");
        System.out.println("\t1.会员信息管理");
        System.out.println("\t2.购物结算");
        System.out.println("\t3.装备返点");
        System.out.println("\t4.注销");
        System.out.println("********************************");
        System.out.println("请选择，输入数字");
        int num=scan.nextInt();
        while(num>4 ||num<1){
            System.out.println("数字错误，请重新输入：");
            num=scan.nextInt();
        }
        System.out.println("登陆成功！");
    }
}