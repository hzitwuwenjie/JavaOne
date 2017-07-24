package com.jc02.weiyilun;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 9:01
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1
{
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
        //System.out.println(d.t[0]);
        //System.out.println(d.t[1]);
        //System.out.println(d.t[2]);
        for(int i=0;i<d.t.length;i++)
        {
            d.t[i] = true;
            System.out.println(d.t[i]);
        }

    }
}
