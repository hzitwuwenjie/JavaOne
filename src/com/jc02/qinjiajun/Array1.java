package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月22日 - 9:01
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive p =new Pritimive();
        System.out.println("p.a="+p.a + "," +"p.b="+ p.b + "," + "p.c="+p.c);
        p.a=true;
        p.b=true;
        p.c=true;
        for (int i = 0; i <3 ; i++) {
            p.t[i]=true;
            System.out.println("t"+i+" "+p.t[i]);
        }

        System.out.println("p.a="+p.a + "," +"p.b="+ p.b + "," + "p.c="+p.c);
    }
}