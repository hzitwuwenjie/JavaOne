package com.jc02.lichenxi;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("********************************");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("********************************");
        Scanner in=new Scanner(System.in);
        System.out.print("请选择，输入数字：");
        int i = in.nextInt();
        while(i<1||i>4){
            System.out.print("输入错误，请重新输入数字：");
            i = in.nextInt();
        }
    }
}
