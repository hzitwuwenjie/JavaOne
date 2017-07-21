package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 11:37　                           |
 * |    @description   从1循环到150，分别打印　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {
        for (int i=1;i<=150;i++){

            if (i%3==0){
                System.out.println(i + "\tfoo");
            }
            if (i%5==0){
                System.out.println(i + "\tbiz");
            }
            if (i%7==0){
                System.out.println(i + "\tbaz");
            }
            else System.out.println(i);
        }
    }
}

