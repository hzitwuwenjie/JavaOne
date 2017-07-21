package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 11:37
 * |  @description   for语句练习
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi3 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++){
            System.out.print(i);
           if(i%3==0){
               System.out.print("foo");
           }
            if(i%5==0){
                System.out.print("biz");
            }
            if(i%7==0){
                System.out.print("baz");
            }
            System.out.println("");
        }
    }
}