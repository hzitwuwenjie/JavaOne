package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月22日 - 9:13　                           |
 * |    @description   　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive pri=new Pritimive();
        Pritimive d=new Pritimive();

        for (int i=0;i<pri.t.length;i++)
        {
            System.out.print(pri.t[i]+"\t");
        }
        System.out.println();
        for (int j=0;j<d.t.length;j++)
        {
            d.t[j]=true;
            System.out.print(d.t[j]+"\t");
        }
    }
}

