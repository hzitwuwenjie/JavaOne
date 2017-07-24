package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/22.
 */

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月22日 - 9:34
 * |    @description   　　　使用For循环打印图形5
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi15 {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8-i; j++)
                System.out.print(" ");
            if(i==0)
                System.out.print("*");
            else if(i==8){
                for (int k = 0; k < 17; k++)
                    System.out.print("*");
            }else{
                System.out.print("*");
                for (int m = 0; m < 2*i-1; m++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        }
    }

