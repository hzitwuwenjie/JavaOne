package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 13:56　                    
 *  |    @description   算出输入正数负数的次数　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi6 {
    public static void main(String[] args) {
        int zhengshu=0;
        int fushu=0;
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数字:");
        do{
            i=input.nextInt();
            if(i>0)
                zhengshu++;
            if(i<0)
                fushu++;
        }while(i!=0);
        System.out.println("正数的个数："+zhengshu);
        System.out.println("负数的个数："+fushu);
    }
}
