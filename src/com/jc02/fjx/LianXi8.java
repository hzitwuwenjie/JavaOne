package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 16:12
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi8 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        int b=0;
        int a=0;
        int c=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄：");
            b=age.nextInt();
            if (b>30){
                a++;
            }
            else if (b<30){
                c++;
            }
        }
        System.out.println("30岁以下的比例是："+(c/10.0*100)+"%");
        System.out.println("30岁以上的比例是："+(a/10.0*100)+"%");
    }
}
