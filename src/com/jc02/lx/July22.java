package com.jc02.lx;/**
 * Created by 响 on 2017/7/22.
 */

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
        Scanner input= new Scanner(System.in);
        System.out.print("Enter an year number after 1900: ");
        int year= input.nextInt();
        System.out.println("Tue Wed Thu Fri Sat Sun Mon");
    }
    public static String week(int year){
        int day= 0;
        for (int i= 0; i< year- 1900; i++){
            if (i% 4== 0&& i% 100!= 0){
                day+= 366;
            }
            else if (i% 100== 0&& i% 4== 0){
                day+= 366;
            }
            else
                day+= 365;
        }
        String[] weekend= {"Tue","Wed","Thu","Fri","Sat","Sun","Mon"};
        int index= day% 7;
        String week= weekend[index];
        return week;
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
    public static void printmonth(int year){

    }
}
