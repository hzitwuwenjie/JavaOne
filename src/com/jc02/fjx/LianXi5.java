package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 13:44
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i= 0;
        int j=0;
        int z=0;
        System.out.println("请输入整数：");
        do {
            i = n.nextInt();
            if (i>0)
                j++;
           if(i<0)
                z++;
            if(i==0)
                break;
        }while(i != 0);
        System.out.println("正数个数为"+j);
        System.out.println("负数个数为"+z);
    }
}
