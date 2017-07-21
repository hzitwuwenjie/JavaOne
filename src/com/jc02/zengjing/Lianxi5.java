package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 11:52
 * |  @description   正负数个数
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int zhengshu =0;
        int fushu =0;
        int i=0;
        System.out.println("请输入数字");
        do{
            i=input.nextInt();
            if(i>0){
                zhengshu=zhengshu+1;
            }else if(i<0){
                fushu=fushu+1;
            }

        }while(i!=0);
        System.out.println("正数个数："+zhengshu);
        System.out.println("负数个数："+fushu);
    }
}