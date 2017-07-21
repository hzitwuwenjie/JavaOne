package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 15:51　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age=0;
        int max=0;
        int min=0;
        for(int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄");
            age=input.nextInt();
            if(age>30)
            {
                max++;

            }
            else{
                min++;
            }
        }
        System.out.println("30岁以上比例"+(max/10.0*100)+"%");
        System.out.println("30岁以下比例"+(min/10.0*100)+"%");

    }
}

