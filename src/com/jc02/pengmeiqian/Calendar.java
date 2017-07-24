package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月22日 - 18:59
 * |    @description   日历表
 * +---------------------------------Oooo-----------------------------+
 */
public class Calendar {
        int year;
        int month;
    public boolean leapYear(int year){
        return year%4==0 && year%100!=0 ||year%400==0;
    }
    public int getSumDays(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 4:case 6:case 9:case 11:
                return 30;
            case 2:
                return leapYear(year)?29:28;
            default:
                return 0;
        }
    }
    public int getAllDays(int year,int month){
        int sum=0;
        for(int i=1900;i<year;i++){
            sum+=leapYear(i)?366:365;
        }
        for(int i=1;i<month;i++){
            sum+=getSumDays(year,i);
        }
        return sum;
    }
    public void showCalendar(int year,int month){
        int sumdays=getAllDays(year, month);
        int kongge=sumdays%7+1;
        System.out.println("\n==============================================================");
        System.out.println("\t\t\t\t\t\t\t"+year+"年"+month+"月");
        System.out.println("==============================================================");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        for(int i=0;i<kongge;i++){
            System.out.print(" \t\t");
        }
        if(kongge==7)
            System.out.println();
        for(int i=1;i<=getSumDays(year, month);i++){
            System.out.print(i+"\t\t");
            if((i+kongge)%7==0)
                System.out.println();
        }
    }
}
