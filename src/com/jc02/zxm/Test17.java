package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 19:22　                           |
 * |    @description   空三角　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test17 {
    public static void main(String[] args) {
        int i;
        int j;
        int m;
        for(i=1;i<9;i++)
        {
            for (j=1;j<=9;j++) {
                if ((i + j) == 10) {


                        System.out.print("*");

                } else {
                    System.out.print("\t");
                }

            }

            for (m=1;m<=i;m++)
            {   switch (m)
              {
                case 1:
                    System.out.print("\t");
                    continue;
                default:
                 if ((m - i) == 0) {


                    System.out.print("*");

                }
                 else {
                    System.out.print("\t");
                }
              }
            }
            System.out.println();
        }
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");

    }
}

