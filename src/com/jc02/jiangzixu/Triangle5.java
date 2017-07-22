package com.jc02.jiangzixu;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Triangle5 {
    public static void main(String[] args) {
        
        for (int i = 1; i <=10; i++) {
            if (i<10){
            for (int j = i; j <10 ; j++) {
                System.out.print("  ");
            }
            

            System.out.print("* ");
            for (int j = 11-i; j <10 ; j++) {
                System.out.print("  ");
            }
            for (int j = 12-i; j <10 ; j++) {
                System.out.print("  ");
            }
            if(i>1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        else {
                for (int j = 1; j <i ; j++) {
                    System.out.print("* * ");
                }
                System.out.println("* ");
            }
        }
    }
}

