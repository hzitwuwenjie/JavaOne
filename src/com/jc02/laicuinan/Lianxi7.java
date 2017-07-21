package com.jc02.laicuinan;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/21.
 */
public class Lianxi7 {    public static void main(String[] args) {
    int countup=0;
    int countdown=0;
    int age;
    double a=0;
    double b=0;
    Scanner input=new Scanner(System.in

    );
    System.out.println("请输入10位顾客的年龄:");
    for(int i=0;i<10;i++)
    {

        age=input.nextInt();
        if (age>30)
        {
            countup=countup+1;
        }
        else
        {
            countdown=countdown+1;
        }

    }
    a=((double)countup/10)*100;
    b=((double)countdown/10)*100;
    System.out.println("30岁以上的比例是:"+a+"%");
    System.out.println("30岁以下的比例是:"+b+"%");

}
}
