package com.jc02.tong;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("魔界饰品分发系统+\t");
        System.out.println("********************************");
        System.out.println("1.账号信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.装备返点");
        System.out.println("4.注销");
        System.out.println("********************************");
        System.out.println("请选择，输入数字：");


        int flag=0;
        while(flag<1||flag>4){
            flag=input.nextInt();
            System.out.println("输入错误，请重新输入数字：");
        }
        if (flag==1){
            System.out.println("1.账号信息管理");
        }
        if (flag==2){
            System.out.println("2.购物结算");
        }
        if (flag==3){
            System.out.println("3.装备返点");
        }
        if (flag==4){
            System.out.println("4.注销");
        }

    }
}




