package com.jc02.zxm;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 11:52　                           |
 * |    @description   求1到100的偶数之和　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
        while(a<=100)
        {
            sum=sum+a;
            a=a+2;
        }
        System.out.println("偶数之和为："+sum);

    }
}

