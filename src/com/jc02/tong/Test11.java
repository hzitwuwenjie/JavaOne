package com.jc02.tong;


import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a =3;
        int b=0;

        for (int i=0;i<3;i++) {
            System.out.println("请输入你的账户");
            String name = input.next();
            System.out.println("请输入你的密码");
            String pwd = input.next();


            b=a-i-1;

            if (name.equals("jc02") && pwd.equals("123")) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登陆失败"+"你还有"+b+"次机会");
            }
        }

        System.out.println("登陆次数超过限制！程序退出");
        System.exit(0);



    }

}
