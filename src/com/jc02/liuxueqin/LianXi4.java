package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 11:50　                    
 *  |    @description   while、do/while语句练习　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class LianXi4 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while (i<=100){
            i+=2;
            sum+=i;
        }
        System.out.println("1到100之间的所有偶数之和是："+sum);
    }
}
