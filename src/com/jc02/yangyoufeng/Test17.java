package com.jc02.yangyoufeng;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 19:50
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test17 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=i;j<10;j++){
                System.out.print(" ");
            }for (int j=10-i;j<10;j++){
                System.out.print("*");
            }for (int j=11-i;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}