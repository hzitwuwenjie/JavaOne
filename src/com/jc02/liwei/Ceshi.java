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
 * |　@create 2017年07月24日 - 10:36
 * |    @description   　　　测试
 * +---------------------------------Oooo---------------------------------------+
 */
public class Ceshi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int year;
        int month;
        Calander m=new Calander();
        m.leapYear(2016);
        System.out.println("该年是闰年么"+m.leapYear(2016));

       Calander a=new Calander();
        a.getSumDays(2017,7);
        System.out.println("天数是"+a.getSumDays(2017,7));
    }
}
