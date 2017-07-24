package com.jc02.lx;/**
 * Created by 响 on 2017/7/22.
 */

import com.jc02.zxm.calendar.Calendar;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create
 * |  @description
 * 1900年1月1日星期一
 * 输入年份显示该年一月的月历
 * P-上一年
 * N-下一年
 * ALL-全年
 * 1`输入年份
 * 2·判断平年还是闰年
 * 3·该年一月一日是周几
 * 4·打印一月的月历
 * 用for遍历每一年，求出和1900年相隔多少天
 * +---------------------------------Oooo---------------------------------------+
 */
public class July22 {
    public static void main(String[] args) {
        July22 m = new July22();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        int month = 1;
        String msg = "";
        do {
            m.showCalandar(year, month);
            System.out.println("\n输入N继续显示下一个月，输入P显示上一个月，ALL显示全年，其他字符结束");
            msg = input.next();
            if (msg.equalsIgnoreCase("n")) {
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                } else if (msg.equalsIgnoreCase("p")) {
                    month--;
                    if (month < 1) {
                        month = 12;
                        year--;
                    }
                } else if (msg.equalsIgnoreCase("all")) {
                    for (int i = 0; i < 11; i++) {
                        m.showCalandar(year, i);
                    }
                    month = 12;
                } else {
                    break;
                }
            }

        }while (true) ;

    }

    public void showCalandar(int year, int month) {
        int sumday= getAllDays(year, month);
        int kongge= sumday% 7+ 1;


        System.out.print("\n========================================");

        System.out.println("\t\t\t\t" + year + "年" + month + "月");

        System.out.print("\n========================================");
        System.out.print("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");
        for (int i= 0; i< kongge; i++){
            System.out.print(i + "\t\t");
            if ((i+ kongge)% 7== 0)
                System.out.println();
        }
    }
    public int getAllDays(int year, int month){
        int sum= 0;
        for (int i= 1900; i< year; i++){
            sum+= pr(i)?366:365;
        }
        for (int i= 1;i<month; i++){
            sum+= getSumDays(year, i);
        }
        return sum;
    }
    public  static boolean pr(int year){
        boolean pr;
        if (year% 4== 0&& year% 100!= 0){
            pr= true;
        }
        else if (year% 100== 0&& year% 4== 0){
            pr= true;
        }
        else
            pr= false;
        return  pr;
    }
    public int getSumDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return pr(year) ?29:28;
            case 4:
            case 6:
            case 9:
            case 11:
                return  30;
        default: return 0;
        }
    }

}
