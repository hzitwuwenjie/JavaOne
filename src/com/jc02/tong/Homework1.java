package com.jc02.tong;


public class Homework1 {
    public static void main(String[] args) {


        for(int i = 10; i >0; i--)
        {
            for(int j = 0; j < 10 - i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
