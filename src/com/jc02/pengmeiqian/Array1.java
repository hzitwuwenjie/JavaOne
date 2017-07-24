package com.jc02.pengmeiqian;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月22日 - 11:18
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
        for(int i=0;i<d.t.length;i++){
            System.out.print(d.t[i] + "\t");
        }
        System.out.println();
        for(int i=0;i<d.t.length;i++){
            d.t[i]=true;
            System.out.print(d.t[i] + "\t");
        }

    }
}
