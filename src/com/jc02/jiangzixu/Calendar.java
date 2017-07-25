package com.jc02.jiangzixu;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class Calendar {
    public int year=0;
    public int month=0;
    public boolean isRunnian(int year){
        return (year%4==0&&year%100!=0||year%400==0);
    }
    public int monthDays(int year,int month){
        int days=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days =31;break;
            case 4:
            case 6:
            case 9:
            case 11: days =30;break;
            case 2:days=(isRunnian(year)?29:28);break;
        }
        return days;
    }
    public int totalDays(int year,int month){
        int total=0;
        for (int i = 1900; i <year; i++) {
            total+=(isRunnian(i)?366:365);
        }
        for (int i=1;i<month;i++)
        {
            total+=monthDays(year,i);
        }
        return total;
    }
    public void showCalendar(int year,int month){
        System.out.println("------------------------------------------");
        System.out.println("星期日\t"+"星期一\t"+"星期二\t"+"星期三\t"+"星期四\t"+"星期五\t"+"星期六\t");
        for (int i = 1; i <=totalDays(year,month)%7+1; i++) {
            System.out.print("\t\t");
        }
        if(totalDays(year,month)%7==6){
            System.out.println();
        }
        for (int i = 1; i <=monthDays(year,month); i++) {
            System.out.print(i + "\t\t");
            if((i+(totalDays(year,month)%7+1))%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
