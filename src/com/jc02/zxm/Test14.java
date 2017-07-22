package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 18:17　                           |
 * |    @description   打印倒等边直角三角形　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test14 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=0;i<=10;i++)
        {
            for(j=0;j<=10;j++)
            {
                if(j>i)
                {
                    System.out.print( "*" + "\t");

                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }
}

