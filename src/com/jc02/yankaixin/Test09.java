package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 15:30
 * |  @description  计算各层次顾客年龄比例
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;
        int maxage = 0;
        int minage = 0;
        for (int i = 1; i <=10; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄：");
            age = input.nextInt();
            if(age>30)
                maxage++;
            else if(age<30)
                minage++;
        }
        System.out.println("30岁以下的比例是：" + minage/10.0*100 + "%");
        System.out.println("30岁以上的比例是：" + maxage/10.0*100 + "%");
    }
}
