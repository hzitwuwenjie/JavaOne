package com.jc02.fankelei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 9:31
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Test14 d = new Test14();
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i]);
        }
        for (int i = 0; i < d.t.length; i++) {
            d.t[i]=true;
        }
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i]);
        }
    }
}
