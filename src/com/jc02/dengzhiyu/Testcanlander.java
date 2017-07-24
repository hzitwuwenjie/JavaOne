package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 10:38　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Testcanlander {
    public static void main(String[] args) {
        Canlander a=new Canlander();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=input.nextInt();
        int month=1;
        String b="";
        do {
            a.showCanlander(year,month);
            System.out.println("\n请继续输入，n代表显示下一个月，p代表显示上一个月，all代表显示全部月份");
            b=input.next();
            if(b.equalsIgnoreCase("n")){
                month++;
                if (month>12){
                    month=1;
                    year++;
                }
            }else if (b.equalsIgnoreCase("p")){
                month--;
                if (month<1){
                    month=12;
                    year--;
                }
            }else if(b.equalsIgnoreCase("all")){
                for (int i=1;i<12;i++){
                    a.showCanlander(year,i);

                }
                month=12;
            }else {
                break;
            }

        }while(true);
    }
}

