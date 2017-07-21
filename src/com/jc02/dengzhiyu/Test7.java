package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 12:23　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;
        int zheng=0;
        int fu=0;
        System.out.println("请输入数字");
        do{
            i=input.nextInt();
            if(i>0){
                zheng++;
            }
            if(i<0){
                fu++;
            }
        }
        while (i!=0);
        System.out.println("正数的个数是："+zheng);
        System.out.println("负数的个数是："+fu);

    }
}

