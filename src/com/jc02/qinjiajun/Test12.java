package com.jc02.qinjiajun;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 15:53
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入用户名：");
            String a = scan.next();
            System.out.println("请输入密码：");
            String b = scan.next();
            String pass = "123456";
            String user = "jc02";
            if (a.equals(user) && b.equals(pass)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (2 - i == 0)
                {
                    System.out.println("登陆次数过多，程序退出！");
                    System.exit(0);
                }else
                {
                    System.out.println("账号或密码错误,清您重新输入,您还剩"+(2-i)+"次机会");
                }
            }
        }
    }
}