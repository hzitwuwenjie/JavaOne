package com.jc02.wangxainlei;

/**
 * Created by THINK on 2017/7/22.
 */
public class Test13e {
    public static void main (String[] args){

        int  i=0;
        int  j=0;
        int  k=0;
        int  l=0;
        String c=" ";
        String d="*";
        for (i=0;i<10;i++){                       //列
            for(j=0;j<=10-i;j++) {
                System.out.print(c);
            }
            System.out.print(d);
            for(k=1;k<=2*i-1;k++){
                System.out.print(c);
            }
            if (i==0)System.out.print("");
                else System.out.print(d);
            System.out.println("");
        }
        for(l=0;l<=10;l++) {
            System.out.print(c+d );
        }
                 }

    }






