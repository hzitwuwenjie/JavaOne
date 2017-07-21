package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:49
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            System.out.print("请输入用户名：");
            String username = in.next();
            System.out.print("请输入密码：");
            String password = in.next();
            if (username.equals("jc02") && password.equals("123")) {
                System.out.println("欢迎登陆Shopping系统!");
            } else {
                if (2 - i == 0) {
                        System.out.println("您输入的错误次数过多，程序退出");
                        System.exit(0);
                    } else {
                        System.out.println("账号或密码错误，您还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}