package com.jc02.lwj;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:19
 * |    @description   1
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        System.out.println("\t\t\t魔界饰品分发系统");
        System.out.println("************************");
        System.out.println("1.账号信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.装备返点");
        System.out.println("4.注销");
        System.out.println("************************");
        System.out.println("请选择，输入数字：");
        Scanner input=new Scanner(System.in);
        int flag=input.nextInt();
        while(flag>4||flag<1){
            System.out.println("输入错误，请重新输入");
            flag=input.nextInt();
        }
        switch (flag){
            case 1:
                System.out.println("账号信息管理");
                break;
            case 2:
                System.out.println("购物结算");
                break;
            case 3:
                System.out.println("装备返点");
                break;
            case 4:
                System.out.println("注销");
                break;
        }

    }
}
