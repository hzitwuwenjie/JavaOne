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
        out.OutputCalendarOne(year);
        System.out.println();
        System.out.println("p\t\tn\t\tall\t\t");
        System.out.println("请输入您的选择");
        String select=input.next();
        if(select.equals("all")){
            for (int i=1;i<=12;i++)
            {
                System.out.println(year+"年"+i+"月份的日历为：");
                out.OutputCalendar(year, i);
                System.out.println();
            }
        }
        else if (select.equals("n")){

                System.out.println("下一月份的日历为："+year+"年" +(month+1)+"月份");
                out.OutputCalendar(year, month + 1);

        }
             else if(select.equals("p")){

                System.out.println("上一月份的日历为："+(year-1)+"年 12月份");
            out.OutputCalendar(year - 1, 12);

        }
    }
}