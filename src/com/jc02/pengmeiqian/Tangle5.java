package com.jc02.pengmeiqian;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 19:31
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Tangle5 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int k=8;k>=i;k--){
                System.out.print(" ");
            }
            if(i!=9){
                for(int j=2*i-1;j>=1;j--){
                    if(j==1 || j==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }else{
                for(int j=2*i-1;j>=1;j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
