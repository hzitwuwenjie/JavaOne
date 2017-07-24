package com.jc02.fankelei;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 10:37
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Mycan {
    public static void main(String[] args) {
        Can c = new Can();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        int month =1;
        String str="";
        do{
            c.showCan(year,month);
            System.out.println("\n输入n显示下一个月，输入p显示上一个月，输入all显示今年全年日历，输入其他字符退出：");
            str=input.next();
            if(str.equalsIgnoreCase("n")){
                month++;
                if(month>12){
                    month=1;
                    year++;
                }
            }else if(str.equalsIgnoreCase("p")){
                month--;
                if(month<1){
                    month=12;
                    year--;
                }
            }else if(str.equalsIgnoreCase("all")){
                for (int i = 1; i <=11 ; i++) {
                    c.showCan(year,i);
                }
                month=12;
            }
            else
                break;
        }while (true);
    }
}