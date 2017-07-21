package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:39
 * |    @description 编写程序将一个十进制的数转换成二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int num=input.nextInt();
        String change="";
        while(num!=0){
            //System.out.print(num % 2);
            change=change+num%2;
            num=num/2;
        }
        for (int i =change.length()-1 ; i>=0 ; i--) {
            System.out.print("二进制数为" + "change.charAt(i)");
        }
    }
}
