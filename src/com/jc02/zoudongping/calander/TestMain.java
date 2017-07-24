package com.jc02.zoudongping.calander;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 9:34
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMain {
    public static void main(String[] args) {
        MyCalander m=new MyCalander();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份");
        int year =input.nextInt();
        int month=1;
        String msg="";
        do {
            m.showCalander(year,month);
            System.out.println("\n输入N显示下一个月。输入P显示上一个月。输入All显示全年日历");
            msg=input.next();
            if (msg.equalsIgnoreCase("n")){
                month++;
                if (month>12){
                    month=1;year++;
                }
            }
            else if(msg.equalsIgnoreCase("p")){
                month--;
                if(month<1){
                    month=12;
                    year--;
                }
            }
            else if(msg.equalsIgnoreCase("all")){
                for(int i=1;i<=11;i++){
                    m.showCalander(year,i);
                }
                month=12;
            }
        }while (true);
    }
}