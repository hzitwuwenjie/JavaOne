package com.jc02.weiyilun;
import java.util.Scanner;



/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 15:33
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Calendar
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        int month = 1;
        do {
            monthyear(month, year);
            biao(month, year);
            System.out.print("\n输入p代表上一月份，输入n代表下一月份，输入all代表所有月份：");
            String str = input.next();
            if (str.equalsIgnoreCase("p")) {
                month--;
                if (month == 1)
                    year--;
            } else if (str.equalsIgnoreCase("n")) {
                month++;
                if (month == 12)
                    year++;
            } else if (str.equalsIgnoreCase("all"))
            {
                for(int i=1;i<=11;i++) {
                    monthyear(i, year);
                    biao(i, year);
                }
                month=12;
            }
            else break;
        }while(true);
           }
    public static void monthyear(int month,int year)
    {
        String months[] = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println("--------------------------");
        System.out.println("\n\t\t"+months[month-1]+" "+year);
        System.out.println("--------------------------");
        System.out.println("日  一  二  三  四  五  六");
    }
    public static int day(int year)
    {
        int sum = 0;
        for(int i=1900;i<year;i++)
        {
            if(year%400==0 || (year%4==0 && year%100!=0) )
                sum=sum+366;
            else
                sum=sum+365;
        }
        return sum;
    }
    public static int monthday(int month,int year) {
        int sum = 0;
        switch (month)

        {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                sum = 31;
                break;
            case 4:case 6:case 9:case 11:
                sum = 30;
                break;
            case 2:
                if(year%400==0 || (year%4==0 && year%100!=0))

                sum = 28;
                else
                    sum=29;
                break;
        }
        return sum;
    }
    public static int week(int month,int year) {
        int sum = 0;
        for(int i = 1;i<month;i++) {
            sum = sum + monthday(i, year);
        }
        int countday=sum+day(year);
        int kongge=countday%7;
        return kongge;
    }

    public static void biao(int month,int year)
    {
        for(int i = 1;i<=week(month,year);i++){

             System.out.print(" \t");
             }
        for(int j = 1;j <=monthday(month, year) ;j++){
        System.out.print(j + "\t");
        if((j+week(month,year))%7==0)
        System.out.println();
        }
    }

}
