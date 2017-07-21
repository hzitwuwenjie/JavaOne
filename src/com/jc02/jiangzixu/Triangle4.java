package com.jc02.jiangzixu;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Triangle4 {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = i; j <10 ; j++) {
                System.out.print("  ");
            }
            for (int j=10-i; j <10 ; j++) {

                System.out.print("* ");
            }
            for (int j=11-i; j <10 ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
