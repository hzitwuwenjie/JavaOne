package com.jc02.pengmeiqian;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 18:20
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Tangle2 {
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
