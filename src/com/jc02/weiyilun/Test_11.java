package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:59
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_11
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i =0;i<3;i++) {
            System.out.println("请输入用户名");
            String a = input.next();
            System.out.println("请输入密码");
            String b = input.next();
            if (a.equals("jim") && b.equals("123456")) {
                System.out.println("欢迎登陆MyShopping系统");
                break;
            }
            else if (i == 2) {
                System.out.println("对不起，三次机会均输入错误");
            } else
                System.out.println("用户名或密码输入错误，您还有" + (2 - i) + "次机会");

        }

    }
}