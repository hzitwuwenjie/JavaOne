package com.jc02.wangxainlei;

/**
 * Created by THINK on 2017/7/21.
 */
public class Test13c {      // 正直角
    public static void main (String[] args){

        int  i=0;
        int  j=0;
        int k=0;
        String c=" ";
        String d="*";
        for (i=0;i<10;i++){                       //列
            for(j=0;j<=10-i;j++) {
                System.out.print(c);
            }
            for(k=0;k<=i;k++){
                System.out.print(d);
            }
            System.out.println();
        }
    }
}


