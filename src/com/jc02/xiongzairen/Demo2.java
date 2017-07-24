package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 8:26
 * |    @description   日历
 * +---------------------------------Oooo---------------------------------------+
 */
public class Demo2 {
    private int isLeapYear(int year){         //判断该年是否为闰年
        if((year%4==0 && year%100!=0) || year%400==0)
            return 1;
        else
            return 0;
    }

    private int getWeek(int year){          //得到该年第一个月第一天星期几
        int week;
        int count_days = 0;
        for (int i = 1900; i < year; i++) {
            if(isLeapYear(i)==1)
                count_days += 366;
            else
                count_days += 365;
        }
        week = count_days%7+1;
        return week;
    }

    public void showCalendar(int year){
        int week = getWeek(year);
        int days;                     //每个月的天数
        int day=1;                    //每个月开始的第一天;
        int num=0;                    //满七天换行
        System.out.println("\t\t\t\t\t\t" + year + "年");
        System.out.println("*********************************************************");
        for (int month = 1; month <= 12; month++) {
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                days = 31;
            else if(month==4 || month==6 || month==9 || month==11)
                days = 30;
            else if(month==2 && isLeapYear(year)==1)
                days = 29;
            else
                days = 28;
            System.out.println("\t\t\t\t\t\t" + month + "月");
            System.out.println("一\t\t二\t\t三\t\t四\t\t五\t\t六\t\t日");
            for (int i = 0; i < week-1; i++){
                System.out.print("\t\t");
                num++;
            }
            for (int j = 1; j <= days; j++) {
                System.out.print(day + "\t\t");
                day++;
                num++;
                if(num%7==0){
                    System.out.println();
                    num = 0;
                }
            }
            week = num+1;        //得到下个月第一天星期几
            day = 1;             //初始化每个月第一天
            num = 0;             //初始化换行条件
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查询的年份：");
        int year = input.nextInt();
        Demo2 c = new Demo2();
        c.showCalendar(year);
    }

}
