package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 11:48
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int zhengshu = 0;
        int fushu = 0;
        do{
            i=input.nextInt();
            if(i<0)
                fushu++;
            else if (i>0)
                zhengshu++;
        }while(i!=0);
        System.out.println("输入的正数个数为：" + zhengshu);
        System.out.println("输入的负数个数为：" + fushu);
    }
}
