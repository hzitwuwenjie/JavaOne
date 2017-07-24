package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 10:12
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class MyCalander {
    int year;
    int month;
    public boolean leapYear(int year){
       return year%4==0&& year%100!=0 ||year%400==0;
    }
    public int getMonday(int year,int month){
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
    public int getAllDays(int year,int month){
        int sum =0;
        for (int i = 1900; i <year ; i++) {
            sum+=leapYear(i)?366:365;
        }
        for (int i = 1; i <month; i++) {
            sum+=getMonday(year,i);
        }
        return sum;
    }
    public void showCanlander(int year,int month){
        int sumday = getAllDays(year,month);
        int blank = sumday%7+1;
        System.out.println("\n\t\t\t\t"+year+"年"+month+"月");
        System.out.println("--------------------------------------------------");
        System.out.println("日\t\t一\t\t二\t\t三\t\t四\t\t五\t\t六");
        for (int i = 0; i <blank ; i++) {
            System.out.print(" \t\t");
        }
        if(blank==7){
            System.out.println();
        }
        for (int i = 1; i <=getMonday(year,month) ; i++) {
            System.out.print(i+"\t\t");
            if((i+blank)%7==0){
                System.out.println();
            }
        }
    }
}