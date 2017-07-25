package com.jc02.jiangzixu;

import java.util.Scanner;

/**
 * Created by jiangzixu on 2017/7/24.
 */
public class Test {
    public static void main(String[] args) {
        Calendar Ca = new Calendar();
        Scanner input = new Scanner(System.in);
        String value;
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        do {
            Ca.showCalendar(year,month);
            System.out.print("输入y返回后一个月的值， 输入n返回前一个月的值，输入all返回这一年的所有月份，输入其他值退出： ");
            value = input.next();
            if(value.equalsIgnoreCase("y")){
                month++;
                if (month>12){
                    month=1;
                    year++;
                }
            }
            else if(value.equalsIgnoreCase("n")){
                month--;
                if(month<1){
                    month=12;
                    year--;
                }
            }
            else if(value.equalsIgnoreCase("all")){
                for (int i = 1; i <=11 ; i++) {
                    Ca.showCalendar(year,i);
                }
                month=12;
            }
        }while (true);

    }
}
