package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 16:07　                           |
 * |    @description   用户登录错误三次限制　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            System.out.println("请输入您的账号:");
            String user=input.next();
            System.out.println("请输入您的密码:");
            String pwd=input.next();
            if (user.equals("jc02")&&pwd.equals("1234"))
            {
                System.out.println("登录成功");
                return;
            }
            else{
                if (2-i==0)
                {
                    System.out.println("您今天的登录次数已用完");

                }
                else{
                    System.out.println("账号或密码错误，请重新登录，您还剩"+(2-i)+"次机会");
                }
            }
        }
    }
}

