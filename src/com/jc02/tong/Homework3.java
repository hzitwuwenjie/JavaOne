package com.jc02.tong;


public class Homework3 {
    public static void main(String[] args) {
        int a=9;
        int b=9;
        for(a =0; a < b ; a++)                   //控制输出多少行
        {
            for(int space =0; space<(b-a); space++)//输出空格
                System.out.print(" ");
            for(int mark=0; mark<a; mark++) //每行输出多少个 *
                System.out.print("*");
            System.out.println();               //换行输出
        }
    }
}
