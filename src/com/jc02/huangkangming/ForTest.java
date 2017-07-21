package com.jc02.huangkangming;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 18:13
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ForTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    public static void test1() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

   public static void test2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("  ");
            }
            for (int x = 0; x < 10-i; x++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void test3() {
        for (int i = 0; i <9; i++) {
            for (int j =1; j <9-i; j++) {
                System.out.print("  ");
            }
            for (int x = 0; x < i+1; x++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void test4(){
        for (int i= 1; i <= 9; i++) {
            for (int j = 9; j >= i ;j--) {
                System.out.print("  ");
            }
            for (int x= 1; x <= i; x++) {
                System.out.print(" *");
            }
            for (int y = 1; y< i; y++) {
                System.out.print(" *");
            }
            System.out.println();
        }
}
    public static  void test5(){
        for(int i=1; i<=9; i++){
            for(int j=1;j<=9-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i==1 || i==9){
                    System.out.print(" *");
                }else{
                    if(k==1 || k==2*i-1){
                        System.out.print(" *");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void test6(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 9; j>= i ;j--) {
                    System.out.print("  ");
                }
            for (int x = 1; x <= i; x++) {
                    System.out.print(" *");
                }
            for (int y = 1; y < i; y++) {
                    System.out.print(" *");
                }
            System.out.println();
            }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ;j++) {
                    System.out.print("  ");
                }
            for (int x = 9; x>= i; x--) {
                    System.out.print(" *");
                }
            for (int y = 9; y > i; y--) {
                    System.out.print(" *");
                }
            System.out.println();
            }
        }
    }
