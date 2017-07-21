package com.jc02.qinjiajun;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 9:24
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        Random  rand = new Random();
        int num2 = rand.nextInt(10);
        System.out.println("请输入一个四位整数");
        int num3 = num.nextInt();
        if(num3 <1000 || num3 > 9999)
        {
            System.out.println("输入数字不正确，请重新输入");
            return;
        }else {
        System.out.println("您输入的数字是："+ num3);
        System.out.println("随机数字："+num2);
        if(num3/100%10 == num2)
        {
            System.out.println("你中奖了");
        }else {
            System.out.println("谢谢参与");
        }}


    }}