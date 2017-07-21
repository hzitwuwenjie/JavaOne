package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 11:46
 * |  @description   数字求和
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi4 {
    public static void main(String[] args) {
        int i =0;
        int sum =0;
        while(i<=100){
            sum =sum+i;
            i= i+2;
        }
        System.out.println("1~100间所有偶数之和："+sum);
    }
}