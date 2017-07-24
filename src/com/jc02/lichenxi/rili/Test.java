package com.jc02.lichenxi.rili;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月24日
 */
public class Test {
    public static void main(String[] args) {
        Can m=new Can();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        int month = 1;
        String msg = "";
        do{
            m.showCan(year,month);
            System.out.println("\n输入n显示下一个月，输入p显示上一个月，输入all显示全年，输入其它字符退出");
            msg = input.next();
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
            }else if(msg.equalsIgnoreCase("all")) {
                    for (int i = 1; i <= 11; i++) {
                        m.showCan(year, i);
                    }
                    month = 12;

            }else {
                break;
            }
        }while (true);
    }
}
