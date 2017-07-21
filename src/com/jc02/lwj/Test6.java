package com.jc02.lwj;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:53
 * |    @description   while循环
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<100){
            if(i%2==0){
                sum=sum+i;
                i=i+2;
            }
        }
        System.out.println(sum);
    }
}
