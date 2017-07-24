package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月22日 - 19:53　                    
 *  |    @description   日历的制作　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class RiLi {
    /**
     * 判断输入的年份是不是闰年
     * @param year
     * @return
     */
    public boolean leapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            return true;
        }else return false;
    }

    /**
     * 输出某年某月的天数
     * @param year
     * @param month
     * @return
     */
    public int getMonthDays(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    return 31;
            case 4:case 6:case 9:case 11:
                return 28;
            case 2:
                return leapYear(year)?29:28;
            default:
                return -1;
        }
    }

    /**
     * 计算输入的年月到1900年一月的总天数
     * @param year
     * @param month
     * @return
     */
    public int sumDays(int year,int month){
        int sum=0;
        //计算过了几年的总天数
        for(int i=1900;i<year;i++){
            sum+=leapYear(year)?366:365;
        }

        //计算后面几月的总天数
        for(int i=1;i<month;i++){
            sum+=getMonthDays(year,month);
        }
        return  sum;
    }

    /**
     * 将日历表显示出来
     * @param year
     * @param month
     */
    public void showRiLi(int year,int month){
        int alldays=sumDays(year, month);
        int kongge=alldays%7+1;
        System.out.println("\n===============================================================");
        System.out.println("\t\t\t"+year + "年" + month + "月");
        System.out.println("===============================================================");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        for (int i = 0; i <kongge ; i++) {
            System.out.println("\t\t");
        }
        if (kongge==7){
            System.out.println();
        }
        for (int i = 1; i <getMonthDays(year,month) ; i++) {
            System.out.println(i+"\t\t");
            if ((i+kongge)%7==0) {
                System.out.println();
            }
        }
    }
}
