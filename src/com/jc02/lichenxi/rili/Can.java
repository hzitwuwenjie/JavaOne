package com.jc02.lichenxi.rili;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class Can {
    public boolean leapYear(int year) {
        return year%4==0&&year%100!=0||year%400==0;
    }
    public int sumDays(int year,int month){
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
    public int allDays(int year,int month){
        int sum=0;
        for(int i=1990;i<year;i++){
            sum+=leapYear(i)?366:365;
        }
        for(int i=1;i<month;i++){
            sum+=sumDays(year,i);
        }
        return sum;
    }
    public void showCan(int year,int month){
        int sumday=allDays(year,month);
        int kong=sumday%7+1;
        System.out.println("\n-------------------------------------------------------");
        System.out.println("\t\t\t\t\t"+year+"年"+month+"月");
        System.out.println("-------------------------------------------------------");
        System.out.println("周日\t周一\t周二\t周三\t周四\t周五\t周六\t");
        for(int i=0;i<kong;i++){
            System.out.print("\t\t");
        }
        if(kong==7)
            System.out.println();
        for(int i=1;i<sumDays(year,month);i++){
            System.out.print(i+"\t\t");
            if((i+kong)%7==0)
                System.out.println();
        }
    }

}
