package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 10:12
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
 class  Red
        {
            public  static void word()

            {
                System.out.println("魔界饰品分发系统");
                System.out.println("********************************");
                System.out.println("1.登陆系统");
                System.out.println("2.退出");

            }

        }
public class Test_4
{
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Red.word();
        System.out.println("请输入一个数字");
        int i = input.nextInt();
        switch(i) {
            case 1:
                System.out.println("魔界饰品分发系统");
                System.out.println("********************************");
                System.out.println("1.会员管理系统");
                System.out.println("2.购物结算");
                System.out.println("3.装备返点");
                System.out.println("4.注销");
                break;
            case 2:
                Red.word();
                break;
            default:
                System.out.println("输出的数字不在1-4之间");
                break;
        }

    }

}
