package com.jc02.wangxainlei;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.util.Scanner;

public class Test5 {
    public static  void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\t魔界饰品分发系统");
        System.out.println("\t\t1.登录系统");
        System.out.println("\t\t2.退出");

        int i = input.nextInt();

        //int k = input.nextInt();
        switch (i) {
            case 1:
                System.out.println("\t\t1.会员信息管理");
                System.out.println("\t\t1.购物结算");
                System.out.println("\t\t装备返点");
                System.out.println("\t\t注销");
                int j= input.nextInt();
                switch (j){

                    case 1:
                        System.out.println("\t\t1.显示所有会员信息");
                        System.out.println("\t\t1.添加会员信息");
                        System.out.println("\t\t1.修改会员信息");
                        System.out.println("\t\t1.查询会员信息");
                        break;
                    case 2:
                        System.out.println("\t\t1.购物结算");
                        break;
                    case 3:
                            System.out.println("\t\t装备返点");
                        break;
                    case 4:
                            System.out.println("\t\t注销");
                        break;
                }
                break;
            case 2:
                System.out.println("--退出--");
                break;
        }

    }
}




