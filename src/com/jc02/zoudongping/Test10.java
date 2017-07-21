package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 14:39
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
 /**   public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("输入一个十进制的数字");
        int num=input.nextInt();
        String msg=Integer.toBinaryString(num);
        System.out.println(msg);
    }
 **/
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("请输入一个十进制的数字：");
     int num = input.nextInt();
     String bin="";
     while(num!=0)
     {
         bin=bin+num%2;
         num=num/2;
     }
     //将一个字符串从右往左输出
     for(int i=bin.length()-1;i>=0;i--)
     {
         System.out.print(bin.charAt(i));
     }
 }
}