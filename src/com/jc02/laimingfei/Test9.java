package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test9 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        String username;
        String password;

        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入用户名 ");
            username=input.next();
            System.out.println("请输入密码");
            password=input.next();
            if(username.equals("jc02")&&password.equals("123456"))
            {
                System.out.println("登陆成功");
                break;
            }
               else  if(i==2)
            {
                System.out.println("输入错误达到3次");
                System.exit(0);
        } else
                    System.out.println("输入错误,还有"+(2-i)+"次机会");

        }

    }
}
