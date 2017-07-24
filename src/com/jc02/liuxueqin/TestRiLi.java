package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 10:19　                    
 *  |    @description   测试日历方法　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class TestRiLi {
    public static void main(String[] args) {
        RiLi m = new RiLi();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        int month = 1;
        String qwe = "";
        do {
            m.showRiLi(year, month);
            System.out.println("\n请输入n继续显示下一个月，输入p显示上一个月，输入all显示全年日历，输入其他字符退出");
            qwe = input.next();
            if (qwe.equalsIgnoreCase("n")) {
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                } else if (qwe.equalsIgnoreCase("p")) {
                    month--;
                    if (month < 1) {
                        month = 12;
                        year--;
                    }
                } else if (qwe.equalsIgnoreCase("all")) {
                    for (int i = 1; i <= 11; i++) {
                        m.showRiLi(year, i);
                    }
                    month = 12;
                } else {
                    break;
                }
            }
        } while (true);
    }
}

