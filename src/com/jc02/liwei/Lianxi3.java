package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 11:53
 * |    @description   　　　循环结构练习--for
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            if (i%3 == 0) {
                System.out.print( "foo\t");
            }
            if (i % 5 == 0) {
                System.out.print( "biz\t");
            }
            if (i % 7 == 0) {
                System.out.print("baz\t");
            }
            System.out.println();
        }
    }

}