package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 15:35
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi8 {
    public static void main(String[] args) {
        int age;
        int maxcount=0;
        int mincount=0;
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.print("请输入第" + i + "位顾客的年龄:");
            age=input.nextInt();
            if(age>30){
                maxcount++;
            }else if(age<30) {
                mincount++;
            }
        }
        System.out.println("30岁以下的比例是："+(mincount/10.0*100)+"%");
        System.out.println("30岁以上的比例是："+(maxcount/10.0*100)+"%");

    }
}
