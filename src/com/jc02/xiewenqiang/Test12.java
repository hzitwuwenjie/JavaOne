package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 15:54
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名:");
            String user = input.next();
            System.out.print("请输入密码:");
            String password = input.next();
            if (user.equals("jim") && password.equals("123456")) {
                System.out.println("欢迎登录MyShopping系统！");
                break;
            } else {
                if (i == 2)
                    System.out.println("对不起，您3次均输入错误！");
                else
                    System.out.println("输入错误，您还有" + (2 - i) + "次机会");
            }
        }
    }
}
