package com.jc02.lichenxi.test;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=0;
        int a=0;
        int b=0;
        for(int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄");
            number=in.nextInt();
            if(number>30){
                a++;
            }
            else if(number<30){
                b++;
            }
        }
        System.out.println("30岁以下的比例是"+(b/10.0)*100+"%");
        System.out.println("30岁以上的比例是"+(a/10.0)*100+"%");
    }
}
