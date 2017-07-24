package com.jc02.zxm.calendar;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月22日 - 18:46　                           |
 * |    @description   显示日历　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Calendar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        OutputCalendar out=new OutputCalendar();
        System.out.println("请输入一个年份:");
        int year=input.nextInt();
        int month=1;
        out.outPutCalendarOne(year);
        System.out.println();

        do {
            System.out.println("\np(上一个月)\t\tn（下一个月）\t\tall（整年日历）\t\t");
            System.out.println("请输入您的选择");
            String select=input.next();
            if (select.equalsIgnoreCase("all")) {
                for (int i = 1; i <12; i++) {

                    out.outPutCalendar(year, month);
                    month++;
                    System.out.println();
                }
                out.outPutCalendar(year,month);
            } else if (select.equalsIgnoreCase("n")) {
                month++;
                if (month>12){
                    month=1;
                    year++;
                }

                System.out.println("\n下一月份的日历为：" + year + "年" + month  + "月份");
                out.outPutCalendar(year, month );

            } else if (select.equalsIgnoreCase("p")) {
                month--;
                if (month<1){
                    month=12;
                    year--;
                }

                System.out.println("\n上一月份的日历为：" + year + "年 "+month+"月份");
                out.outPutCalendar(year, month);

            }
        }while(true);
    }
}