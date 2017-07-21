package com.jc02.jiangzixu;

import java.util.Scanner;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("您还有" + (3-i) + "次输入机会!");
            System.out.print("请输入用户名：");
            String name = input.next();
            System.out.print("请输入密码：");
            String pwd = input.next();
            if (name.equals("jc02") && pwd.equals("123")) {
                System.out.println("欢迎你登陆MyShopping系统!");
                System.exit(0);
            } else {
                System.out.println("输入错误！");
            }
        }
        System.out.println("对不起，您三次均输入错误");
    }
}
