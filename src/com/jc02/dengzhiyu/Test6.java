package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 11:56　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Test6 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        do{
            sum=sum+i;
            i=i+2;
        }while(i<=100);
        System.out.println("累加之和："+sum);
    }
}

