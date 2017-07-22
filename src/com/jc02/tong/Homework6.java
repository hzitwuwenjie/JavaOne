package com.jc02.tong;


public class Homework6 {
    public static void main(String[] args) {
        /*int i=1;
        int j=1;
        int k=1;
        for(i=1; i<10; i++)
        {
                                            /* 观察每行的空格数量 */
           /* for( j=1;  j<=(10-i) ;  j++  )
            {
                System.out.print(" ");            //输出空格
            }
                                           /* 观察每行*号的数量 */
           /* for( k=1 ;  k<i*2 ; k++  )
            {
                System.out.print("*");            //输出*号
            }
            System.out.println();                //每次循环换行
        }

        for(i=9; i<20; i++)
        {
                                            /* 观察每行的空格数量 */
           /* for( j=9;  j<=(20-i) ; j++  )
            {
                System.out.print(" ");            //输出空格
            }
                                           /* 观察每行*号的数量 */
           /* for( k=9 ;  k<i*2 ; k++  )
            {
                System.out.print("*");            //输出*号
            }
            System.out.println();                //每次循环换行
        }*/
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

        for (int i = 10; i >=1; i--) {
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
