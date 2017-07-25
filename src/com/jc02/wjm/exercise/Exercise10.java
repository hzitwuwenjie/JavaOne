package com.jc02.wjm.exercise;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:33
 * |  @description   age
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise10 {
    public static void main(String[] args) {
        int age, young=0,old=0;
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=10;i++) {
            System.out.println("请输入第"+i+"位顾客的年龄");
            age=input.nextInt();
            if(age>30) old++;
            else if(age<30) young++;
        }
        System.out.println("30岁以上的比例是："+old/10.0*100+"%");
        System.out.println("30岁以下的比例是："+young/10.0*100+"%");
    }
}
