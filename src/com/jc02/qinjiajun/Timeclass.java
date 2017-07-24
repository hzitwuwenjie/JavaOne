package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月24日 - 11:05
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Timeclass {
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


    public  void showPage(int month,int year) {
        int day= getDayNum(month,year);
        int allDay =getDayOfYearNum(year)+getDayOfMonthNum(month, year);//总天数
        int weekNum = allDay % 7 + 1;//得出当月第一天是周几
        System.out.println("\n日\t" + "一\t" + "二\t" + "三\t" + "四\t" + "五\t" + "六\t");
        for (int i = 0; i < weekNum; i++) {//打印空格
            System.out.print(" ");
        }
        if (weekNum == 7) {
            System.out.print("\n");
            for (int i = 1; i <= day; i++) {//输出日期、并且换行
                System.out.print(i + "\t");
                if (((weekNum + i) % 7) == 0) {
                    System.out.println();
                }
            }
        }

    }}
