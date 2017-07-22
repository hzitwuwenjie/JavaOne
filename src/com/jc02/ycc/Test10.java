package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 14:35
 * |    @description   将十进制转换成二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制的数字：");
        int num=input.nextInt();
        String bin="";

        //面向对象
        //String msg = Integer.toBinaryString(num);
        //System.out.println(msg);

        while (num!=0){
            //int yushu = num%2;
            //System.out.print(yushu);
            bin=bin+num%2;
            num=num/2;
        }
        //输出一个字符串的每个字符 从右往左输出  charAt 通过指定下标返回值
        for(int i=bin.length()-1;i>=0;i--){
            System.out.print(bin.charAt(i));
        }

    }
}
