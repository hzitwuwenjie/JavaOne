package com.jc02.lichenxi.test;

/**
 * Created by 李晨曦 2017年07月21日 - 12:05
 */
public class Test5 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=100)
        {
            sum = sum +i;
            i=i+2;
        }
        System.out.println("1-100之间所有偶数之和："+sum);
    }
}
