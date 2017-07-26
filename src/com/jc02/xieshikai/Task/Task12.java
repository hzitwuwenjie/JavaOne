package com.jc02.xieshikai.Task;

import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 16:41
 * |  @description   用户登录验证，验证次数最多3次
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task12 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            System.out.print("请输入用户名：");
            String id=input.next();
            System.out.print("请输入密码：");
            String pwd=input.next();
                if(id.equals("jc02")&&pwd.equals("qwer")) {
                    System.out.println("欢迎登陆购物系统！");
                    break;
                }
                else if(i-2==0) {
                    System.out.println("对不起，您3次账号或密码均输入错误，已退出系统。");
                    System.exit(0);
                    } else
                        System.out.println("账号或密码错误！您还有"+(2-i)+"次机会！");
        }
    }
}
