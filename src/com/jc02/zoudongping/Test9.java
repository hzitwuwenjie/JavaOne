package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 14:31
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        int maxcount=0;
        int mincount=0;
        for (int i=1;i<=10;i++)
        {
            System.out.println("请输入第"+i+"位顾客的年龄");
            age=input.nextInt();
            if(age>30){
                maxcount++;
            }
            else  mincount++;
        }
        System.out.println("30岁以上的比例"+maxcount*100/10+"%");
        System.out.println("30岁以下的比例"+mincount*100/10+"%");
    }
}