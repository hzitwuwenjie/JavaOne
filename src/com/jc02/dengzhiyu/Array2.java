package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月22日 - 9:57　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int a[] = new int[6];
        int b;
        a[0] = 99;
        a[1] = 85;
        a[2] = 82;
        a[3] = 63;
        a[4] = 60;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要新增的数字：");
        a[5] = input.nextInt();
        System.out.println("未排序的数组:");
        System.out.println(Arrays.toString(a));
        int mid;                            // 定义一个中间变量，起到临时存储数据的作用
        for (int i = 0; i < a.length; i++) {     // 执行冒泡排序法
            for (int j = i; j < a.length; j++) {
                if (a[j] > a[i]) {
                    mid = a[i];
                    a[i] = a[j];
                    a[j] = mid;
                }
            }
        }
        System.out.println("排序后的数组");
        System.out.println(Arrays.toString(a));

//
    }
}


