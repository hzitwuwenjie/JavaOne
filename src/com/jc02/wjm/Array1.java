package com.jc02.wjm;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月22日 - 9:12
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive d=new Pritimive();
        for(int i=0;i<d.t.length;i++)
            System.out.println(d.t[i]);
        for(int j=0;j<d.t.length;j++)
            d.t[j]=true;
        for(int k=0;k<d.t.length;k++)
            System.out.println(d.t[k]);

    }
}
