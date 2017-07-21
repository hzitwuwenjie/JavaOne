package com.jc02.lwj;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:39
 * |    @description   for循环
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++){
            System.out.print(i + "\t");
            if(i%3==0){
                System.out.print("foo");
            }
            if(i%5==0){
                System.out.print("biz");
            }
            if(i%7==0){
                System.out.print("baz");
            }
            System.out.println("\t");
        }
    }
}
