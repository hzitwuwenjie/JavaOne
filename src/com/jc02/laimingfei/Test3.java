package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入四位数");
        int number=input.nextInt();
        int a=number%1000/100;
        System.out.println("第三位数是"+a);
        int b=(int)(Math.random()*10);
        System.out.println("生成的随机数为"+b);
        if(a==b)
            System.out.println("中奖了");
        else System.out.println("没中奖");
    }
}
