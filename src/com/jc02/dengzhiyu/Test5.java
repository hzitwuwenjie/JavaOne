package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 11:45　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Test5 {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=150;i++){
            System.out.print(i);
            if(i%3==0)
                System.out.print("\tfoo" );
            if(i%5==0)
                System.out.print("\tbiz" );
            if(i%7==0)
                System.out.print("\tbaz");
            System.out.print("\n");
        }

    }
}

