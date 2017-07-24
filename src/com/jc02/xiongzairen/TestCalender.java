package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 10:22
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestCalender {
    public static void main(String[] args) {
        GetCalender m = new GetCalender();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        int month = 1;
        String msg = "";
        do {
        m.showCalendar(year, month);
        System.out.println("\n请输入n继续显示下一个月，输入p显示上一个月，输入all显示今年今月的全年日历，输入其他字符提出");
        msg = input.next();
            if (msg.equalsIgnoreCase("n")) {
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else if (msg.equalsIgnoreCase("p")) {
                month--;
                if (month < 1) {
                    month = 12;
                    year--;
                }
            } else if (msg.equalsIgnoreCase("all")) {
                for (int i = 1; i <= 11; i++) {
                    m.showCalendar(year, i);
                }
                month = 12;
            } else {
                break;
            }
        } while (true);
    }
}
