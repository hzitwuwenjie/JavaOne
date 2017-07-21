package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 13:32
 * |    @description   计算正数负数
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;
        int zhengshu=0;
        int fushu=0;
        System.out.println("请输入数字");
        do{
            i=input.nextInt();
            if(i>0){
                zhengshu++;
            }
            if(i<0){
                fushu++;
            }
        }
        while (i!=0);
        System.out.println("正数的个数是："+zhengshu);
        System.out.println("负数的个数是："+fushu);

    }
}
