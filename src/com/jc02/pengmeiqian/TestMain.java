package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月24日 - 10:09
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class TestMain {
    public static void main(String[] args) {
        Calendar m = new Calendar();
        Scanner input=new Scanner(System.in);
        System.out.print("请输入年份");
        int year=input.nextInt();
        int month=1;
        String msg="";
        do{
            m.showCalendar(year,month);
            System.out.println("\n请输入n显示下一个月份，输入p显示上一个月份，输入all显示该年所有月份,输入任意字符退出");
            msg = input.next();
            if(msg.equals("n")){
                month++;
                if(month>12){
                    month=1;
                    year++;
                }
            }else if(msg.equals("p")){
                month--;
                if(month<1){
                    month=12;
                    year--;
                }
            }else if(msg.equals("all")){
                for(int i=1;i<=11;i++) {
                    m.showCalendar(year, month);
                }
                month=12;
            }else{
                break;
            }
        }while(true);
    }
}
