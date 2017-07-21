package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 15:25
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        int maxCount=0;
        int minCount=0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄:");
            int age = input.nextInt();
            if(age>30)
                maxCount++;
            else if(age<30)
                minCount++;
        }
        System.out.println("30岁以下的比例是："+(minCount/10.0*100)+"%");
        System.out.println("30岁以上的比例是："+(maxCount/10.0*100)+"%");
    }
}
