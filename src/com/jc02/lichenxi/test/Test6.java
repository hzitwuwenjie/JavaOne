package com.jc02.lichenxi.test;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日 - 12:08
 */
public class Test6 {
    public static void main(String[] args) {
        int zs=0;
        int fs=0;
        int num=0;
        Scanner in = new Scanner(System.in);
        do {
            num = in.nextInt();
            if (num < 0)
                fs++;
            else if (num > 0)
                zs++;
        }while(num!=0);
        System.out.println("正数个数：\t"+zs);
        System.out.println("负数个数：\t"+fs);
    }
}
