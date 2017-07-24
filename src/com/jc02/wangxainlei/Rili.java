package com.jc02.wangxainlei;

import java.util.Scanner;

/**
 * Created by THINK on 2017/7/24.
 */
public class Rili {


    public boolean leapYear(int year) {return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;}
    public int getSumDays(int year,int month) {
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 4:case 6:case 9:case 11:
                return 30;
            case 2:
                return leapYear(year)?29:28;
            default:
                return  0;
        }
    }
    public int getAllDays(int year, int month) {
        int sum = 0;
        for (int i = 1900; i < year; i++) {
            sum += leapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < year; i++) {
            sum += getSumDays(year, i);
        }
        return sum;
    }
    public void showRili(int year,int  month)        {
            int sumday=getAllDays(year,month);
            int kongge=sumday%7;
            System.out.println(kongge);
            // System.out.println(sumday);
            System.out.println("\n----------------------------------");
            System.out.println("\t\t\t\t" + year + "年" + month + "月");
            System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
            for (int i=0;i<kongge;i++){
                System.out.print("\t\t");
            }
            if (kongge==7)
            {System.out.println();}
            for(int i=1;i<=getSumDays(year,month);i++){
                System.out.print(i+"\t\t");
                if((i+kongge)%7==0)
                {System.out.println();}
            }

    }
    public static void main(String[] args) {
        //int year;
        //int month;
        Rili m=new Rili();
        Scanner input= new Scanner(System.in);
        System.out.println("请输入年份");
        int year=input.nextInt();

        int month=1;
        String msg="";
        do{
            m.showRili(year,month);
            System.out.println("\n请输入n继续显示下一个月--输入P显示上一个月--输入all 显示该年份所有月份--其他字符退出");
            msg=input.next();
            if(msg.equalsIgnoreCase("n")){
                month++;
                if (month>12){
                    month=1;year++;}
            }else if(msg.equalsIgnoreCase("p")){
                month--;
                if (month<1)
                {month=12;year--;}
            }else if (msg.equalsIgnoreCase("all")) {
                for (int i=1;i<=11;i++){
                    m.showRili(year,i);
                }
                month=12;
            }else {
                break;
            }

        }while (true);
    }
}
