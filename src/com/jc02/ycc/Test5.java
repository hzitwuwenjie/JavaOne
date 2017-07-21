package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 13:35
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args){

        for(int i=1;i<=150;i++){
            System.out.print(i);
            for(int j=i;j % 3 == 0; j++){
                System.out.print(" foo");
            }
            for(int j=i;j%5==0;j++){
                System.out.print(" biz");
            }
            for(int j=i;j%7==0;j++){
                System.out.print(" baz");
            }
            System.out.println();
        }

    }
}
