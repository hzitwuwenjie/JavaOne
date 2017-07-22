package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月22日 - 9:18
 * |  @description   数组练习成绩排序
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result[]= new int[6];
        result[0]=99;
        result[1]=85;
        result[2]=82;
        result[3]=63;
        result[4]=60;
        System.out.println("请输入成绩：");
        int a =input.nextInt();
        result[5]=a;
        int b =0;
        int n =0;
        for (int i = 1; i < result.length; i++) {
            for (int j = i; j > 0; j--) {
                if (result[j] > result[j - 1]) {
                     n = result[j - 1];
                    result[j - 1] = result[j];
                    result[j] = n;
                    b=j-1;
                }else break;
            }
        }
        System.out.println("插入的下标为："+b);
        for (int i = 0; i < 6; i++) {
            System.out.println(result[i]);
        }


    }
}