package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 15:37
 * |  @description   将数字转换成二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整：");
        int i = input.nextInt();
        StringBuffer s = new StringBuffer("");
        while(i/2!=1){
            s.append(i%2);
            i /= 2;
        }
        s.append(i%2);
        s.append(1);
        System.out.println(s.reverse());
    }
}
