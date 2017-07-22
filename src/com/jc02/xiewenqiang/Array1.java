package com.jc02.xiewenqiang;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月22日 - 9:12
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
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
