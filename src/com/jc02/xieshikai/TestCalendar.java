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
 * |　@create 2017年07月22日 - 19:46
 * |  @description   制作日历
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class TestCalendar {

    public static void main(String[] args) {
        Calendar111 c = new Calendar111();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要查询的年份：");
        int year = input.nextInt();
        if (year < 1900) {
            System.out.println("输入的年份错误!");
            return;
        } else {
//        System.out.print("请输入需要查询的月份：");
            int month = 1;
            String choice = "";
//        System.out.println(year+"年是不是闰年？"+c.leapYear(year));
//        System.out.println(year+"年"+month+"月有"+c.getMonthDays(year,month)+"天");
//        c.getSumDays(year,month);
            do {
                c.showCalendar(year, month);
                System.out.print("输入P代表上一个月，N代表下一个月，ALL代表整年：");
                choice = input.next();
                if (choice.equalsIgnoreCase("P")) {
                    if (month == 1) {
                        month = 12;
                        year--;
                    } else
                        month--;
                } else if (choice.equalsIgnoreCase("N")) {
                    if (month == 12) {
                        month = 1;
                        year++;
                    } else
                        month++;
                } else if (choice.equalsIgnoreCase("ALL")) {
                    for (int i = 1; i <= 11; i++) {
                        c.showCalendar(year, i);
                    }
                    month = 12;
                } else {
                    break;
                }
            } while (true);
        }
    }

}

