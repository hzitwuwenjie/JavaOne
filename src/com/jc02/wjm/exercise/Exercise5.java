package com.jc02.wjm.exercise;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 11:37
 * |  @description   for语句
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise5 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++) {
            System.out.print(i);
            if (i % 3 == 0)
                System.out.print("foo");
            if (i % 5 == 0)
                System.out.print("biz");
            if (i % 7 == 0)
                System.out.print("baz");
            System.out.println();
        }
    }
}
