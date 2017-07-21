package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 11:58
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi5 {
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
