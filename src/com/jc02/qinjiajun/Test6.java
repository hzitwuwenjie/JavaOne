package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 13:49
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        int i=2;
        int sum=0;
        while(i >=1 && i<=100 )
        {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}