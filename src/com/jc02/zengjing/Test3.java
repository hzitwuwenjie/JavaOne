package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 10:40
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCalander s=new MyCalander();
        System.out.println("请输入年份");
        int year =input.nextInt();
        int month = 1;
        String msg="";
        do {
            s.showCanlander(year, month);
            System.out.println("\n请输入n查询下一个月份\n请输入p查询上一个月份\n请输入all查询全年月份");
            msg =input.next();
            if(msg.equalsIgnoreCase("n")){
                month++;
                if(month>12){
                    month=1;
                    year++;
                }
            }else if(msg.equalsIgnoreCase("p")){
                month--;
                if(month<1){
                    month=12;
                    year--;
                }
            }else if(msg.equalsIgnoreCase("all")){
                for (int i = 1; i <=11 ; i++) {
                    s.showCanlander(year,i);
                }
                month =12;
            }else
                break;
        }while(true);
    }
}