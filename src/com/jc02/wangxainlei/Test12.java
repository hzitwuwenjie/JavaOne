package com.jc02.wangxainlei;
import java.util.Scanner;
public class Test12 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int i=0;
        String name="";
        String password="";
    for (i=0;i<3;i++){
        System.out.println("请输入您的账号：");
        name=input.next();
        System.out.println("请输入密码：");
        password=input.next();
        if(name.equals("123")&&password.equals("123")){
            System.out.println("登录 成功");
            break;
        }else {
               if(2-i==0){
                   System.out.println("登录次数超过限制，程序退出");
                    System.exit(0);

               }else {
                   System.out.println("账号或密码错误，请重新输入，您还有"+(2-i)+"次机会");
               }
        }

    }

    }
}