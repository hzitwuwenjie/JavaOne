package com.jc02.wangxainlei;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static  void main (String[] args) {


        Scanner j = new Scanner(System.in);
        Random Random=new Random();
        int num =Random.nextInt(10);
        System.out.println("请输入一个四位整数");
        int i = j.nextInt();//接收键盘的数
        if (i < 1000 || i > 9999) {
            System.out.println("输入的值范围不正确，请重新输入");
            //return;//代表方法停止运行，退出了方法
        }
        else {

            System.out.println("你输入的数字是:" + i);
            System.out.println("随机数字:" + num);
            if (i / 100 % 10 == num) {
                System.out.println("恭喜中奖");

            }
            else {
                System.out.println("O(∩_∩)O谢谢参与");
            }
        }

    }
}








