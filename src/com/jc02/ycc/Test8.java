package com.jc02.ycc;


import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 14:23
 * |    @description   循环19
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t魔界饰品分类");
        System.out.println("**************************************");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("**************************************");

        System.out.println("请选择，输入数字：");
        Scanner input=new Scanner(System.in);

        int flag=input.nextInt();
        while (flag>4||flag<1){
            System.out.println("数字输入错误。请重新输入");
            flag=input.nextInt();
        }
    }
}
