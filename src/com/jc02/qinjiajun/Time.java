package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月22日 - 19:13
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;



public class Time {
    public static void main(String[] args) {
        Timeclass T=new Timeclass();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份...");
        int year = scan.nextInt();
        int month = 1;
//判断当年是不是闰年（（被4整除 并且不能被100整除） 或者 能被400整除）
        boolean bool = false;//true：闰年 -----false：平年
        if (T.isLeapYear(year)) {
            bool = true;
        }
        String s = "";
        do {
            T.showPage(month, year);
            System.out.println("\n请输入n显示下一个月，输入p显示上一个月，输入all显示全年：");
            s = scan.next();
            if (s.equalsIgnoreCase("n")) {
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else if (s.equalsIgnoreCase("p")) {
                month--;
                if (month < 1) {
                    month = 12;
                    year--;
                }
            } else if (s.equalsIgnoreCase("all")) {
                for (int i = 1; i <= 11; i++) {
                    T.showPage(i, year);
                }
                month = 12;
            } else
                break;
        } while (true);
    }
}

