package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 11:36
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {
        for(int i =1;i<=150;i++)
        {
            System.out.print(i);
           if(i%3 == 0)
           {
               System.out.print( " foo");
           }
            if(i%5 == 0)
            {
                System.out.print( " bio");
            }
            if(i%7 == 0)
            {
                System.out.print( " bob");
            }
            System.out.println("");
        }
    }
}