package com.jc02.xieshikai;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月24日 - 8:44
 * |  @description   制作日历类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Calendar111 {
    int year;
    int month;
    int day;
    public boolean leapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0)
            return true;
        else
            return false;
    }
    public int getMonthDays(int year,int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return leapYear(year)?29:28;
            default:
                return 0;
        }
    }
    public int getSumDays(int year,int month){
        int sum=0;
        for(int i=1900;i<year;i++)
            sum += leapYear(i)?366:365;
//        System.out.println(year+"年"+1+"月1日距离1900年1月1日的天数："+sum);
        for(int i=1;i<month;i++)
            sum=sum+getMonthDays(year,i);
//        System.out.println(year+"年"+month+"月1日距离1900年1月1日的天数："+sum);
        return sum;
    }
    public void showCalendar(int year,int month){
        System.out.println("----------------------"+year+"年"+month+"月"+"-----------------------");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        int space=getSumDays(year, month)%7+1;
        for (int i = 0; i < space; i++)
            System.out.print(" \t\t");
        if (space==7)
            System.out.println();
        for (int j = 1; j <= getMonthDays(year,month); j++) {
            System.out.print(j+"\t\t");
            if((space+j)%7==0)
                System.out.println();
        }
        System.out.println();
    }
}


