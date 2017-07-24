package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/24.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月24日 - 11:21
 * |    @description   　　　日历测试
 * +---------------------------------Oooo-------------------------------------+
 */
public class Calanderceshi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int year;
        int month;
        Calander m=new Calander();
        System.out.println("请输入年份：");
        year=k.nextInt();
        m.leapYear(year);
        System.out.println("该年是闰年么"+m.leapYear(year));

        Calander a=new Calander();
        System.out.println("请输入年份：");
        year=k.nextInt();
        System.out.println("请输入月份：");
        month=k.nextInt();
        a.getSumDays(year,month);
        a.getALLdays(year,month);
        System.out.println("该月天数是"+a.getSumDays(year,month));
        System.out.println("该月1号距离1900年1月1号的天数是："+a.getALLdays(year,month));

        Calander b=new Calander();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份");

        String msg="";
        do {b.showCalander(year,month);
            System.out.println("\n请输入n显示下一个月，输入p显示上一个月，输入all显示今年全年月份");
            msg=input.next();
            if (msg.equalsIgnoreCase("n")) {
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }else if (msg.equalsIgnoreCase("p")) {
                month--;
                if (month < 1) {
                    month = 12;
                    year--;
                }
            }
            else if (msg.equalsIgnoreCase("all")){
                for (int i = 1; i <11 ; i++) {
                    m.showCalander(year,i);
                }
                month=12;
            }
            else{
                break;
            }
        }while (true);
    }
}
