package com.jc02.zengjing;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月22日 - 9:01
 * |  @description   数组类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Primive d = new Primive();
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i] + " ");
        }
        for (int i = 0; i < d.t.length; i++) {
            d.t[i]=true;
        }
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i] + " ");
        }
    }
}