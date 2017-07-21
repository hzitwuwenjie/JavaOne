package com.jc02.fankelei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:48
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Tset6 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;

        while (i<=100)
        {

            sum=sum+i;
            i=i+2;
        }
        System.out.println("100以内偶数和为\t"+sum);
    }
}
