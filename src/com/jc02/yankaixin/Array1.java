package com.jc02.yankaixin;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月22日 - 9:02
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {

    public static void main(String[] args) {

        Pritimive d = new Pritimive();
        for (int i = 0; i < d.t.length; i++){
            System.out.println(d.t[i]);
            d.t[i] = true;
            System.out.println(d.t[i]);
        }
    }
}
