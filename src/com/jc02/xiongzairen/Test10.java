package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:28
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count1=0;
        int count2=0;
        for(int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄：");
            int age=input.nextInt();
            if(age>30){
                count1++;
            }
            if (age<30){
                count2++;
            }
        }
        System.out.println("30岁以上的比例为:"+(count1/10.0*100)+"%");
        System.out.println("30岁以上的比例为:"+(count2/10.0*100)+"%");

    }
}
