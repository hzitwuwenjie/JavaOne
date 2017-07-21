package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=0;
        int a=0;
        int b=0;
        for(int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄");
            number=input.nextInt();
            if(number>30)
                a++;
            else if(number<30)
                b++;
        }
        System.out.println("30岁以下的比例是"+(b/10.0)*100+"%");
        System.out.println("30岁以上的比例是"+(a/10.0)*100+"%");

        }
}
