package com.jc02.yangyoufeng;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 15:59
 * |    @description十进制转换二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args)
    {
        System.out.println("请输入要转换数字:");
        Scanner s = new Scanner(System.in);
        long i =s.nextLong();
        long sum = 0;
        long yushu,shang=i;
        long weishu=1;
        do
        {
            yushu=shang%2;
            shang/=2;
            sum=sum+yushu*weishu;
            weishu*=10;
        }while(shang!=0);
        System.out.printf("转换的二进制结果为：%d\n",sum);
    }
}