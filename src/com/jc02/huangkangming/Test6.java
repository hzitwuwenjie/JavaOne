package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 11:47
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=100){
            if(i%2==0) {
                sum += i;
            }
            i++;
        }
        System.out.println("偶数之和为："+sum);
        test();
    }
    public static void test(){
        Scanner in=new Scanner(System.in);
        int zhengShu=0;
        int fuShu=0;
        int a;
        do{
            a=in.nextInt();
            if(a>0){
                zhengShu++;
            }
            if(a<0){
                fuShu++;
            }
        } while(a!=0);
        System.out.println("您输入的正数个数为："+zhengShu);
        System.out.println("您输入的负数个数为："+fuShu);
    }
}