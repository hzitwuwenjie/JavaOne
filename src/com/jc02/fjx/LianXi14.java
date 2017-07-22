package com.jc02.fjx;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月22日 - 9:28
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi14 {
    public static void main(String[] args) {
        int max=9;
        for (int i = 1; i <=max; i++) {
            for (int j = max; j >= i; j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}