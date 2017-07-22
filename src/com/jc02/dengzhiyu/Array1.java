package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月22日 - 9:37　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        Pritimive d=new Pritimive();
        System.out.println("赋值前");
        System.out.println(Arrays.toString(d.t));
        System.out.println("赋值后");
        for (int i=0;i<d.t.length;i++){
            d.t[i]=true;
        }
        System.out.println(Arrays.toString(d.t));

    }
}

