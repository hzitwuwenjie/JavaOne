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
 * |　@create 2017年07月24日 - 10:47
 * |    @description   　　　日历
 * +---------------------------------Oooo---------------------------------------+
 */
public class Calander {


    public boolean leapYear(int year){
        if (year%4==0 && year%100!=0 || year%400==0)
        return true;
        else
            return false;
    }


    public int getSumDays(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 4:case 6:case 9:case 11:
                return 30;
            case 2:
                return leapYear(year)?29:28;
            default:
                return -1;
        }
    }





}
