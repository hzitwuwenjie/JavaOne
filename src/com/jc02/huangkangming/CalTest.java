package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 10:25
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class CalTest {
    public static void main(String[] args) {
        Calender c = new Calender();

        Scanner in =new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=in.nextInt();
        int month=1;
        String msg="";
        do {
            c.showCalender(year,month);
            System.out.println("\n 输入n显示下一个月，输入p显示上一个月，输入all显示全年日历，输入其他退出。");
            msg=in.next();
            if(msg.equalsIgnoreCase("n"))
            {
                month++;
                if(month>12)
                {
                    year++;
                    month=1;
                }
            }else if(msg.equalsIgnoreCase("p"))
            {
                month--;
                if(month<1)
                {
                    month=12;
                    year--;
                }
            }else if(msg.equalsIgnoreCase("all"))
            {
                for (int i = 1; i <12 ; i++) {
                    c.showCalender(year,i);
                }
                month=12;
            }else
            {
                break;
            }
        }while (true);
    }
}