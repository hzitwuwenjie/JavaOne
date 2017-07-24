package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Calendar {
         private static  Scanner input;

        public static void main(String[] args) {
            input=new Scanner(System.in);
            System.out.println("请输入年份");
            int year=input.nextInt();
            System.out.println("请输入月份");
            int month=input.nextInt();
            printMonth(year,month);
        }
        public static void printMonth(int year,int month) {
            printMonthTitle(year, month);
            printMonthBody(year, month);
            input=new Scanner(System.in);
            System.out.println("请输入大写的N/P，显示这一年上一月或下一月的日历 ，或输入其它则显示一年的日历");
            String number=input.next();
            for(int i=0;i<12;i++){
             if(number.equals("N")){
                month=month-1;
                if(month<=0)
                    month=12;
              printMonthTitle(year, month);
              printMonthBody(year, month);
                 System.out.println("请输入大写的N/P，显示这一年上一月或下一月的日历 ，或输入其它则显示一年的日历 ");
                 input=new Scanner(System.in);
                  number=input.next();
             }else if(number.equals("P")){
                 month=month+1;
                 if(month>12)
                     month=1;
                 printMonthTitle(year, month);
                 printMonthBody(year, month);
                 System.out.println("请输入大写的N/P，显示这一年上一月或下一月的日历 ，或输入其它则显示一年的日历");
                 input=new Scanner(System.in);
                 number=input.next();
             }else {
                 System.out.println("一年的日历 ");
                   month=0;
                 for(int j=0;j<12;j++){
                     month=month+1;
                     printMonthTitle(year, month);
                     printMonthBody(year, month);
                 }
                break;
              }
            }
        }
        public static void printMonthTitle(int year,int month) {
            System.out.println("            "+getMonthName(month)+"       "+year+"年");
            System.out.println("_____________________________");
            System.out.println(" 日  六  一   二   三  四  五");

        }
        public static void printMonthBody(int year,int month) {
            int startDay=getStartDay(year, month);
            int numberofDaysInMonth=getNumberofDaysinMonth(year, month);
            for(int i=0;i<startDay;i++)
                System.out.print("    ");
            for(int i=1;i<=numberofDaysInMonth;i++) {
                System.out.printf("%4d",i);
                if((i+startDay)%7==0)
                    System.out.println();
            }
            System.out.println();

        }
        public static String getMonthName(int month) {
            String monthName="";
            switch(month) {
                case 1:monthName="一月";
                    break;
                case 2:monthName="二月";
                    break;
                case 3: monthName="三月";
                    break;
                case 4:monthName="四月";
                    break;
                case 5:monthName="五月";
                    break;
                case 6:monthName="六月";
                    break;
                case 7:monthName="七月";
                    break;
                case 8:monthName="八月";
                    break;
                case 9:monthName="九月";
                    break;
                case 10:monthName="十月";
                    break;
                case 11:monthName="十一月";
                    break;
                case 12:monthName="十二月";
                    break;
            }
            return monthName;


        }
        public static int getStartDay(int year,int month) {
            int startMonth=1;
            int totalNumberofDays=getTotalNamberofDays(year, month);

            return (totalNumberofDays+startMonth)%7;
        }
        public static int getTotalNamberofDays(int year,int month) {
            int total=0;
            for(int i=1900;i<year;i++) {
                if(isleapYear(year))
                    total=total+366;
                else
                    total=total+365;
            }
            for(int i=1;i<month;i++) {
                total=total+getNumberofDaysinMonth(year, i);
            }
            return total;
        }
        public static int getNumberofDaysinMonth(int year,int month) {
            int monthDays=0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    monthDays=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    monthDays=30;
                    break;
                case 2:
                    if(isleapYear(year))
                        monthDays=28;
                    else
                        monthDays=27;
                default:
                    break;

            }

            return monthDays;
        }

        public static boolean isleapYear(int year) {
            return (year%100!=0&&year%4==0);
        }


    }

