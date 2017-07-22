package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月22日 - 10:30　                    
 *  |    @description   调用Pritimive方法　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class Array1 {
    public static void main(String[] args) {
        Pritimive d=new Pritimive();//创建Pritimive对象d
        //对象d的成员变量t赋值为true
        for(int i=0;i<d.t.length;i++){
            d.t[i]=true;
            System.out.println(d.t[i]);
        }
    }
}
