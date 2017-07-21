package com.jc02.yangyoufeng;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 16:18
 * |    @description   用户验证登录
 * +---------------------------------Oooo---------------------------------------+
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
            if (name.equals("yyf") && pwd.equals("123")) {
                System.out.println("登陆成功！");
                System.exit(0);
            } else {
                System.out.println("帐号或密码错误！");
            }
        }
        System.out.println("登陆次数超出限制，程序退出！");
    }
}
