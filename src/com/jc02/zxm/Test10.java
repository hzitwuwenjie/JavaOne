package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 15:50　                           |
 * |    @description   统计顾客年龄比例　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        int countup=0;
        int countdown=0;
        int age;
        double a=0;
        double b=0;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入10位顾客的年龄:");
       for(int i=0;i<10;i++)
       {
           age=input.nextInt();
           if (age>30)
           {
               countup=countup+1;
           }
           else
           {
               countdown=countdown+1;
           }

       }
        a=((double)countup/10)*100;
        b=((double)countdown/10)*100;
        System.out.println("30岁以上的比例是:"+a+"%");
        System.out.println("30岁以下的比例是:"+b+"%");

    }
}

