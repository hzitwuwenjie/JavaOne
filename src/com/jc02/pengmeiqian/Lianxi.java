package com.jc02.pengmeiqian;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 9:23
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int i=input.nextInt();
        Random rand = new Random();
        int num = rand.nextInt(1);
        System.out.println("您输入的数字是："+i);
        System.out.println("随机数字是："+num);
        if(i>=1000 && i<=9999)
        {
            if(i/100%10==num)
                System.out.println("您中奖了！");
            else
                System.out.println("谢谢参与！");
        }
        else{
            System.out.println("您输入的数字不在范围内，请输入1000到9999的数字");
        }
    }
}
