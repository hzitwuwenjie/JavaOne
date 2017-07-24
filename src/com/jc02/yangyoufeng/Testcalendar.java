package com.jc02.yangyoufeng;
import java.sql.Time;
import java.util.Scanner;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月24日 - 11:53
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Testcalendar {
    public static void main(String[] args) {
        Calendar t=new Calendar();
        Scanner input=new Scanner(System.in);
        System.out.println("输入年");
        int year=input.nextInt();
        int month=1;
        String msg="";
        do {
            t.showTime(year, month);
            System.out.println("\n输入n继续显示下一个月。输入p显示上一个月。输入ALL显示全年日历");
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