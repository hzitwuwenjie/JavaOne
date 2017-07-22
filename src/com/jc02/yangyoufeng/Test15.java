package com.jc02.yangyoufeng;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 19:34
 * |    @description   打印三角形2
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test15 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for (int j=10-i;j<9;j++){
                System.out.print(" ");
            }
            for(int j=i;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}