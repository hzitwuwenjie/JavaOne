package com.jc02.tong;

/**
 * 　　  　  　     ***********
 * 　　　 　  　    \\　=_=　//
 * 　　　　　  　   (　 .@.@　)
 * +-------****-----( _ )-----****--------------------------------------------+
 * |　@author Tong　　　　　　                                                 |
 * |　@author 江西财经大学                                                     |
 * |　@create 2017年07月21日 - 11:41
 * |  @description   FOO
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {

        int i=0;
        for (i = 0; i <= 150; i++) {
            System.out.println(i);

            if (i % 3 == 0) {
                System.out.println("foo");

            } else if (i % 5 == 0) {
                System.out.println("biz");

            } else if (i % 7 == 0) {
                System.out.println("baz");

            }
        }
    }
}