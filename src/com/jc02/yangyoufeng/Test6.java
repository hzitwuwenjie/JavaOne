package com.jc02.yangyoufeng;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 11:50
 * |    @description   100以内的偶数和
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=100){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("累加和"+sum);
    }
}