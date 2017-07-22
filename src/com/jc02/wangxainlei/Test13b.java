package com.jc02.wangxainlei;

/**
 * Created by THINK on 2017/7/21.
 */
public class Test13b {  //右倒三角
    public static void main (String[] args){

        int  i=0;
        int  j=0;
        int  k=0;
        String c=" ";
        String d="*";
        for (i=1;i<=10;i++){//列
            for(j=1;j<=i-1;j++) {
                System.out.print(c);}
            for(k=0;k<=10-i;k++) {
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
