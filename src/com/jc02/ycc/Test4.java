package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 9:53
 * |    @description   switch
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个月份：");

        int month = input.nextInt();

        switch (month){
            case 1:
                System.out.println("该月份有31天");
                break;
            case 2:
                System.out.println("该月份有28天");
                break;
            case 3:
                System.out.println("该月份有31天");
                break;
            case 4:
                System.out.println("该月份有30天");
                break;
            case 5:
                System.out.println("该月份有31天");
                break;
            case 6:
                System.out.println("该月份有30天");
                break;
            case 7:
                System.out.println("该月份有31天");
                break;
            case 8:
                System.out.println("该月份有31天");
                break;
            case 9:
                System.out.println("该月份有30天");
                break;
            case 10:
                System.out.println("该月份有31天");
                break;
            case 11:
                System.out.println("该月份有30天");
                break;
            case 12:
                System.out.println("该月份有31天");
                break;
            default:
                System.out.println("该月份无效");
                break;

        }
    }
}

