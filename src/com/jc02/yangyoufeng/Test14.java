package com.jc02.yangyoufeng;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 19:22
 * |    @description   打印三角形
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            for (int j =10-i; j < 10; j++)
            {
                System.out.print("\t*");
            }
            System.out.println();
        }
    }

}


