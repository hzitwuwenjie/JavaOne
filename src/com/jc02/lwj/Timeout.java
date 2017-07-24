package com.jc02.lwj;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 8:43
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Timeout {
    public static void main(String[] args) {
        Time t=new Time();
        Scanner input=new Scanner(System.in);
        System.out.println("输入年份");
        int year=input.nextInt();
        int month=1;
        String msg;
        do {
        t.showTime(year,month);
        System.out.println("\n输入n继续显示下一个月。输入p显示上一个月。输入all显示全年日历");
        msg=input.next();
        if (msg.equalsIgnoreCase("n")){
            month++;
            if (month>12){
                month=1;year++;
            }
        }else if (msg.equalsIgnoreCase("p")){
            month--;
            if (month<1){
                month=12;
                year--;
            }
        }else  if(msg.equalsIgnoreCase("all")){
            for (int i = 1; i <12 ; i++) {
                t.showTime(year,i);
            }
            month=12;
        }else {
            break;
        }
        }while (true);
    }
}
