package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:28
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int age=0;
        int sup=0;
        int sub=0;

        for (int i = 1; i <=10 ; i++) {
            System.out.print("请输入第"+i+"位顾客的年龄:");
            age=in.nextInt();
            if(age>30){
                sup++;
            }else if(age<30){
                sub++;
            }
        }
        System.out.println("30岁以下的比例是："+sub/10.0*100+"%");
        System.out.println("30岁以上的比例是："+sup/10.0*100+"%");
    }
}