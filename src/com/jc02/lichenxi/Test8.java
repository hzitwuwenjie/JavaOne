package com.jc02.lichenxi;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入您的账户：");
            String name = input.next();
            System.out.print("请输入您的密码：");
            String pwd = input.next();
            if(name.equals("jc02")&&pwd.equals("123")){
                System.out.println("登陆成功");
                break;
            }else{
                if(2-i==0){
                    System.out.println("登陆次数超过限制！");
                }else{
                    System.out.println("账号或密码错误！请重新输入"+"您还剩"+(2-i)+"登陆机会");
                }

            }
        }

    }
}
