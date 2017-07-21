package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 15:19
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统");
        System.out.println("******************************************************************");
        System.out.println("\t\t\t1.账号信息管理");
        System.out.println("\t\t\t2.购物结算");
        System.out.println("\t\t\t3.装备返点");
        System.out.println("\t\t\t4.注销");
        System.out.println("******************************************************************");
        System.out.print("请选择输入数字：");
        int i = input.nextInt();

        while (i<1||i>4){
            System.out.print("输入错误，请重新输入数字：");
            i = input.nextInt();
        }
    }
}
