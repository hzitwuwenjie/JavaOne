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
 * +---------------------------------Oooo---------------------------------------+
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
        System.out.println("天数是"+a.getSumDays(year,month));
    }
}
