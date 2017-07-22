package com.jc02.pengmeiqian;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 19:56
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Tangle6 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int k=9;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=9;i>=1;i--){
            for(int k=1;k<=10-i;k++){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
