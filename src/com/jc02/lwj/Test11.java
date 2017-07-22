package com.jc02.lwj;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 16:31
 * |    @description   用户登录次数限制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("输入账户：");
            String zh=input.next();
            System.out.println("输入密码：");
            String mm=input.next();
            if(zh.equals("jc02")&&mm.equals("123")){
                System.out.println("登录成功");
            break;
            }
                else{
                    if(2-i==0){
                        System.out.println("登录次数超过限制，程序退出");//
                        System.exit(0);
                    }
                    else{
                        System.out.println("账号密码输入错误！请重新输入，您还剩余"+(2-i)+
                        "次登录机会");
                    }
                }
        }
    }
}
