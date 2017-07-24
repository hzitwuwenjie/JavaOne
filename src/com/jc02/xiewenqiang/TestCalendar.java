package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月24日 - 10:37
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = new Calendar();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        int month =1;
        String msg="";
        do{
            c.showCalendar(year,month);
            System.out.println("\n输入n显示下一个月，输入p显示上一个月，输入all显示今年全年日历，输入其他字符退出：");
            msg=input.next();
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
                    c.showCalendar(year,i);
                }
                month=12;
            }
            else
                break;
        }while (true);
    }
}
