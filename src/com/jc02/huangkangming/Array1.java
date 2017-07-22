package com.jc02.huangkangming;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月22日 - 9:00
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive d=new Pritimive();
        for (int i = 0; i <3 ; i++) {
            System.out.println(d.t[i]);
        }
        for (int i = 0; i <3 ; i++) {
            d.t[i]=true;
            System.out.println(d.t[i]);
        }
    }
}