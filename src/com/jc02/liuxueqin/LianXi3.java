package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 11:37　                    
 *  |    @description   使用for循环　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.sun.org.apache.xpath.internal.SourceTree;

public class LianXi3 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++){
            System.out.print(i);
            if(i%3==0){
                System.out.print("foo");
            }
            if(i%5==0){
                System.out.print("biz");
            }
            if(i%7==0){
                System.out.print("baz");
            }
            System.out.print("\n");
        }
    }
}

