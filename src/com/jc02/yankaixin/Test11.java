package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 16:00
 * |  @description   用户登录验证
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user;
        String pwd;
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名：");
            user = input.next();
            System.out.print("请输入密码：");
            pwd = input.next();
            if(user.equals("tom") && pwd.equals("123"))
                System.out.println("登录成功！");
            else{
                if(2-i==0){
                    System.out.println("对不起，您三次均输入错误！");
                    System.exit(0);
                }else
                    System.out.println("输入错误！您还有" + (2-i) + "次机会！\n");
            }
        }
    }
}
