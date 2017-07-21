package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:55
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String pwd = "";
        for(int i=3;i>0;i--){
            System.out.println("请输入用户名：");
            name = input.next();
            System.out.println("请输入密码：");
            pwd = input.next();
            if (name.equals("jc02") && pwd.equals("123456")) {
                System.out.println("欢迎登录Myshopping系统");
            } else {
                if(i>1) {
                    System.out.println("输入错误，你还有" + (i - 1) + "机会");
                }else{
                    System.out.println("对不起，你三次均输入错误");
                    System.exit(0);//退出程序
                }
            }
        }
    }
}
