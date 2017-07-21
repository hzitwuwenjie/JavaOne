package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 11:52
 * |  @description   while语句练习
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        int count;
        int zhengshu = 0;
        int fushu = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入整数：");

        do {
            count = input.nextInt();
            if (count > 0)
                zhengshu++;
            if (count < 0)
                fushu++;
        } while (count != 0);
        System.out.println("正数的个数：" + zhengshu);
        System.out.println("负数的个数：" + fushu);
    }
}
