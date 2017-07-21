package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 15:23
 * |  @description   顾客年龄调查
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi8 {
    public static void main(String[] args) {
        int i=1;
        int maxcount =0;
        int mincount =0;
        int a=0;
        Scanner input=new Scanner(System.in);
        System.out.println("输入顾客年龄以0退出");
       do{
           System.out.print("请输入第" + i + "位顾客的年龄:");
           a =input.nextInt();
           if(a>30){
               maxcount=maxcount+1;
           }else if(a<30&&a>0){
               mincount=mincount+1;
           }
           i++;
       }while(a!=0);
        System.out.println("30岁以上的比例是："+(maxcount/((double)i-2))*100+"%");
        System.out.println("30岁以下的比例是："+(mincount/((double)i-2))*100+"%");
    }
}