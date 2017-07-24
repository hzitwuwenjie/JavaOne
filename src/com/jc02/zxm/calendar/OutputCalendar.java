package com.jc02.zxm.calendar;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月22日 - 23:04　                           |
 * |    @description   输出日历类　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class OutputCalendar {
    //输出一月份日历
    public static void OutputCalendarOne(int year){

        int sum=1;//因为1900年1月1日是星期一，需要打印一个空格，用来保存总天数；
        int days=0;//用来存储输入月份的天数；
        int weekly=0;//用来存储日历第一行的空格数；
        int month=1;
        //计算从1990年1月1日到xxxx年的天数
        if (year>1900) {
            for (int i = 1900; i < year; i++) {
                if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                    sum = sum + 366;
                } else {
                    sum = sum + 365;
                }
            }
        }
        else {
            for (int i = 1900; i > year; i--) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    sum = sum + 366;
                } else {
                    sum = sum + 365;
                }
            }
        }
        //计算xxxx年的月份天数
        for (int i=1;i<month;i++){
            if (i==2){
                if (year%4==0&&year%100!=0||year%400==0){
                    sum=sum+29;
                }
                else{sum=sum+28;}
            }
            else{
                if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                    sum=sum+31;
                }
                else{sum=sum+30;}
            }
        }
        //判断输入的月份的天数
        if(month==2){
            if (year%4==0&&year%100!=0||year%400==0){
                days=29;
            }
            else{days=28;}
        }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            days=31;
        }
        else{
            days=30;
        }

        //打印日历格式
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        if (sum==1)//如果输入的是1900年份，则需要在第一行打印一个空格；
        {
            sum=8;
            weekly = sum % 7;//求第一行的空白
        }
        else {
            weekly = sum % 7;//求第一行的空白
        }
        //输出日历表
        for (int i=0;i<weekly;i++){
            System.out.print("\t");
        }
        for (int i=1;i<=days;i++){
            if(sum%7==6){
                System.out.print(i+"\n");
            }
            else{
                System.out.print(i+"\t");
            }
            sum=sum+1;
        }

    }
    //输出任意年任意月份日历
    public static void OutputCalendar(int year,int month){

        int sum=1;//因为1900年1月1日是星期一，需要打印一个空格，用来保存总天数；
        int days=0;//用来存储输入月份的天数；
        int weekly=0;//用来存储日历第一行的空格数；
        //计算从1990年1月1日到xxxx年的天数
        if (year>1900) {
            for (int i = 1900; i < year; i++) {
                if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                    sum = sum + 366;
                } else {
                    sum = sum + 365;
                }
            }
        }
        else {
            for (int i = 1900; i > year; i--) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    sum = sum + 366;
                } else {
                    sum = sum + 365;
                }
            }
        }
        //计算xxxx年的月份天数
        for (int i=1;i<month;i++){
            if (i==2){
                if (year%4==0&&year%100!=0||year%400==0){
                    sum=sum+29;
                }
                else{sum=sum+28;}
            }
            else{
                if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                    sum=sum+31;
                }
                else{sum=sum+30;}
            }
        }
        //判断输入的月份的天数
        if(month==2){
            if (year%4==0&&year%100!=0||year%400==0){
                days=29;
            }
            else{days=28;}
        }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            days=31;
        }
        else{
            days=30;
        }

        //打印日历格式
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        if (sum==1)//如果输入的是1900年份，则需要在第一行打印一个空格；
        {
            sum=8;
            weekly = sum % 7;//求第一行的空白
        }
        else {
            weekly = sum % 7;//求第一行的空白
        }
        //输出日历表
        for (int i=0;i<weekly;i++){
            System.out.print("\t");
        }
        for (int i=1;i<=days;i++){
            if(sum%7==6){
                System.out.print(i+"\n");
            }
            else{
                System.out.print(i+"\t");
            }
            sum=sum+1;
        }

    }
}

