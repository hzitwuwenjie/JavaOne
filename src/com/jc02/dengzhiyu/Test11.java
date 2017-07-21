package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 16:01　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入你的账户");
            String name=input.next();
            System.out.println("请输入你的密码");
            String pwd=input.next();
            if(name.equals("yzd")&&pwd.equals("123456")){
                System.out.println("登陆成功");
                break;
            }
            else{
                if(2-i==0)
                {
                    System.out.println("登录次数超过限制！程序退出");
                    System.exit(1);    }
                   else {
                    System.out.println("登录密码或者账户错误！请重新输入，你还剩"+(2-i)+"次登录机会");


                }
            }
        }


    }
}

