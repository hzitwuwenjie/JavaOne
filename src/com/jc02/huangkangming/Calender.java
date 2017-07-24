package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月22日 - 15:41
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Calender {
       //根据年份判断是闰年还是平年
    public boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0 ||year%400==0);
    }
    //根据年份和月份求出该月的总天数
    public int getSumDays(int year,int month){
        switch(month)
        {
            case 1: case 3:case 5:case 7:case 8:case 10:case 12:
            return 31;

            case 4:case 6:case 9:case 11:
            return 30;

            case 2:
              return  isLeapYear(year)?29:28;

            default:
                return -1;
        }
    }
    //根据年份和月份计算该月1号距离1900年1月1号经过的天数
    public int getAllDays(int year,int month){
        int sum=0;
        for (int i = 1900; i <year ; i++)
        {
            sum+=isLeapYear(i)?366:365;
        }
        for (int i = 1; i <month ; i++) {
            sum+=getSumDays(year,i);
        }
        return sum;
    }
    public void showCalender(int year,int month){
        int sumDay=getAllDays(year,month);
        int kongGe=sumDay%7+1;
        System.out.println("\n=================================================");
        System.out.println("\t\t\t\t"+year+"年"+month+"月");
        System.out.println("=================================================");

        System.out.println("星期日\t星期一\t星期二\t三\t星期四\t星期五\t星期六\t");
        for (int i = 0; i <kongGe; i++)
        {
            System.out.print("\t\t");
        }
        if(kongGe==7)
        {
            System.out.println();
        }
        for (int i = 1; i <=getSumDays(year,month) ; i++)
        {
            System.out.print(i+"\t\t");
            if((i+kongGe)%7==0)
            {
                System.out.println();
            }
        }

    }
}
