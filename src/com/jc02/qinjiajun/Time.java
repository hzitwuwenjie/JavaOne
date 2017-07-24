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
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份...");
        int year = scan.nextInt();
        System.out.println("请输入一个月份...");
        int month = scan.nextInt();
//2.判断当年是不是闰年（（被4整除 并且不能被100整除） 或者 能被400整除）
        boolean bool = false;//true：闰年 -----false：平年
        if(isLeapYear(year)){
            bool = true;
        }

//3.根据用户输入的月来判断月的天数
        int day = getDayNum(month, year);//当月天数
//4.求出1900年--用户输入的年份：年份总天数 1900 - 1902 730
        int yearOfDayNum = getDayOfYearNum(year);
//5.求出用户输入的年份的第一天到输入月份的天数
        int monthFoDayNum = getDayOfMonthNum(month, year);
        System.out.println(monthFoDayNum + "========");
        int allDay = yearOfDayNum + monthFoDayNum;//总天数
        System.out.println(allDay);
        int weekNum = allDay % 7;//得出当月第一天是周几
        System.out.println("日\t" + "一\t" + "二\t" + "三\t" + "四\t" + "五\t" + "六\t");
        for (int i = 0; i <= weekNum; i++) {//打印空格
            if(weekNum == 6){
                System.out.println();
            }else{
                System.out.print("\t");
            }
        }
       for (int i = 1; i <= day; i++) {//输出日期、并且换行
            System.out.print(i + "\t");
            if(((weekNum + i +1) % 7) == 0){
                System.out.println();
            }
        }
    }
//判断闰年还是平年
    public static boolean isLeapYear(int year){
        if((year%4 == 0 && year%100 != 0) || (year%400 ==0)){
            return true;
        }
        return false;
    }
//返回当月天数
    public static int getDayNum(int month , int year){
        int day = 0;//当月天数
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                day = 31;
                break;
            case 4:case 6:case 9:case 11:
                day = 30;
                break;
            case 2:
                if(isLeapYear(year)){
                    day = 29;
                }else{
                    day = 28;
                }
                break;
        }
        return day;
    }
//返回1900年到输入年的天数
    public static int getDayOfYearNum(int year){
        int yearOfDayNum = 0;
        for (int i = 1900; i < year; i++) {
            if(isLeapYear(i)){
                yearOfDayNum += 366;
            }else{
                yearOfDayNum += 365;
            }
        }
        return yearOfDayNum;
    }
//返回当年一个月到输入月的天数
    public static int getDayOfMonthNum(int month , int year){
        int monthFoDayNum = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    monthFoDayNum += 31;
                    break;
                case 4:case 6:case 9:case 11:
                    monthFoDayNum += 30;
                    break;
           case 2:
                    if(isLeapYear(year)){
                        monthFoDayNum += 29;
                    }else{
                        monthFoDayNum += 28;
                    }
                    break;
            }
        }
        return monthFoDayNum;
    }



}
