package com.jc02.lwj;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 16:13
 * |    @description   将一个数字转换为二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入一个十进制数字：");
        int num=input.nextInt();
        //面向对象是调用别人的方法
        //String msg=Integer.toBinaryString(num);
        //System.out.println(msg);
        //面向过程则是自己实现
        String bin="";
        while(num!=0){
            bin=bin+num%2;//字符型的相加是直接排到后面
            num=num/2;
        }
        //使得字符串中的每个字符从右往左输出
        for (int i =bin.length()-1; i >=0 ; i--) {
            System.out.print(bin.charAt(i));//
        }
    }
}
