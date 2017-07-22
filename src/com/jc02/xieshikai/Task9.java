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
 * |　@create 2017年07月21日 - 15:47
 * |  @description   用户输入错误时提示，直到输入正确为止
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println("\t\t魔界饰品分发系统");
        System.out.println("**********************************");
        System.out.println("1.会员信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.装备返点");
        System.out.println("4.注销");
        System.out.println("**********************************");
        System.out.print("请选择，输入数字：");
        Scanner input=new Scanner(System.in);
        int choose =input.nextInt();
        while(choose>4||choose<1){
            System.out.print("输入错误，请重新输入数字：");
            choose =input.nextInt();
        }
        System.out.println("终于对了!");
    }
}
