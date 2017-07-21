package com.jc02.tong;

import java.util.Scanner;


public class Test6 {
    public static void main(String[] args) {
        int sum = 0;
        int b = 0;
        int a = 2;
        int e = 0;
        int f = 0;
        while (b < 100)
        {
            b = b + 2;
            sum = sum + b;
        }
            System.out.println(sum);




        /*Scanner input = new Scanner(System.in);
        int c=input.nextInt();
        switch(c){
            case 2:
                if ( c == 0)
                {
                    break;
                }

            case 1:
                if(c>0)
                {
                e++;
                }
                else f++;

                System.out.println("正数有多少个"+e+"负数有多少个"+f);

        }*/
    }
}
