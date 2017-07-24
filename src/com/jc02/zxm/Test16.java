package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 19:02　                           |
 * |    @description   正三角形　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test16 {
    public static void main(String[] args) {
        int i;
        int j;
        int m;
        for (i=1;i<=10;i++)
        {

            for(j=10;j>1;j--)
            {
                if(j>=i)
                {

                    System.out.print("\t");

                }
                else
                {
                    System.out.print( "*" + "\t");
                }
            }
            for (m=1;m<i;m++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println("\t");
        }

    }
}

