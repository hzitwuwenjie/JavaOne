package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 18:39
 * |    @description   　　　计算各年龄层次顾客比例
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi8 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int f=0;
        int j=0;
        int q=0;
        for (int a=1; a <=10 ; a++) {
            System.out.print("请输入第"+a+"位顾客的年龄：");
            q=k.nextInt();
            if(q<30) {
                f = f + 1;
            }
            if(q>30) {
                j = j + 1;
            }
        }
        System.out.println("30岁以下的比例是："+(f/10.0*100)+"%" );
        System.out.println("30岁以上的比例是："+(j/10.0*100)+"%" );
    }
}
