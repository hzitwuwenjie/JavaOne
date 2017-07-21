package com.jc02.wjm;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 11:41
 * |  @description   求和
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise6 {
    public static void main(String[] args) {
        int i=0,sum=0;
        while (i<=100){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("和为："+sum);

    }
}
