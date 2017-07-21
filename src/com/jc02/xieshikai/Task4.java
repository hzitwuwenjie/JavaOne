package com.jc02.xieshikai;

import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 10:16
 * |  @description   switch实现登录菜单跳转
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        System.out.println("请输入代表你要进的菜单数字：");
        int a=input.nextInt();
        switch(a) {
            case 1:
                System.out.println("1.会员信息管理");
                System.out.println("2.购物结算");
                System.out.println("3.装备返点");
                System.out.println("4.注销");
                System.out.println("请输入代表你要进的菜单数字：");
                int b=input.nextInt();
                switch(b) {
                    case 1:
                        System.out.println("1.显示所有会员信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.修改会员信息");
                        System.out.println("4.查询会员信息");
                        break;
                    case 2:
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        break;
                    case 3:
                        System.out.println("该模块尚在装修，敬请期待！");
                        break;
                    case 4:
                        System.out.println("已注销。");
                        break;
                }
                break;
            case 2:
                System.out.println("已退出系统。");
                break;
        }
    }
}
