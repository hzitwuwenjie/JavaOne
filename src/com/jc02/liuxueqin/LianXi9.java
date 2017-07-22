package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 16:29　                    
 *  |    @description   用户登录验证，验证次数最多3次　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = input.next();
            System.out.println("请输入密码：");
            String pwd = input.next();
            if(name.equals("jc")&&pwd.equals("1234")){
                System.out.println("欢迎登录！");
            }else{
                if(2-i==0){
                    System.out.println("登录次数超过限制，程序退出。");
                }else{
                    System.out.println("账号或密码错误，请重新输入，您还剩"+(2-i)+"次机会");
                }
            }
        }
    }
}
