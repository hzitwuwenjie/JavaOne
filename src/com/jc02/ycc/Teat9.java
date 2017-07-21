package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 14:29
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Teat9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        int upcount=0;
        int downcount=0;

        for (int i = 0; i <10 ; i++) {
            System.out.println("请输入第"+i+"位顾客的年龄");
            age=input.nextInt();
            if(age>30){
                upcount++;
            }else{
                downcount++;
            }

        }System.out.println("30岁以上的比例"+(upcount/10.0)*100+"%");
        System.out.println("30岁以上的比例"+(downcount/10.0)*100+"%");
    }
}
