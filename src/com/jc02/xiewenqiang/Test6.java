package com.jc02.xiewenqiang;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 11:47
 * |  @description   do/while语句练习
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }
}
