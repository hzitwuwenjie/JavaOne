package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 19:58
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12b {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int k=0;k<i-1;k++){
                System.out.print(" ");
            }
            for(int j=9;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
