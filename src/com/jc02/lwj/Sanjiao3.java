package com.jc02.lwj;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 19:48
 * |    @description   1
 * +---------------------------------Oooo---------------------------------------+
 */
public class Sanjiao3 {
        public static void main(String[] args) {
            for(int i=1;i<=9;i++){
                for(int j=8;j>=i;j--){
                    System.out.print(" ");
                }
                for(int p=1;p<=i;p++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

