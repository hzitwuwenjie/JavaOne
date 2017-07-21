package com.jc02.tong;
import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age =0;
        int maxage=0;
        int minage=0;
        int i=0;
        double a=0;
        double b=0;
        for (i=1;i<=10;i++){
            System.out.println("请输入第" + i +"位顾客的年龄:");
            age=input.nextInt();
            if (age>30)
                maxage++;
            if (age<30)
                minage++;
        }
        a=maxage/10*100;
        b=minage/10*100;
        System.out.println("30岁以下的比例是："+ b +".0%");
        System.out.println("30岁以上的比例是："+ a +".0%");

    }
}
