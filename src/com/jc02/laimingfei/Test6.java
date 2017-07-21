package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test6 {



    public int sumONEandHundred(){
        int i=0;
        int sum=0;
        while (i<=100){
            sum=sum+i;
            i=i+2;
        }
        return  sum;
    }
    public void number(){
          int a = 0;
        int b = 0;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入整数");
        do {
            num = input.nextInt();
            if (num > 0)
               a++;
            else b++;
        } while (num!=0);
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {

    }
}
