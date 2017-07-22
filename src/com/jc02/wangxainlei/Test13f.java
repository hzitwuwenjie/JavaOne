package com.jc02.wangxainlei;

/**
 * Created by THINK on 2017/7/22.
 */
public class Test13f {
    public static void main (String[] args){

        int  i=0;
        int  j=0;
        int  k=0;
        int  m=0;
        int  n=0;
        String c=" ";
        String d="*";
        //for(i=0;i<=20;i++){
           do{

                  i++;                     //列
                  for(j=0;j<=10-i;j++) {   System.out.print(c);}
                  for(k=1;k<=2*i-1;k++){   System.out.print(d);}
                  System.out.println(i);
           }while (i<10);
             i=10-i;
            do {
                i++;
                for (m=0; m<=i; m++) { System.out.print(c);}
                for (n=0; n<=2*(10-i-1); n++) {System.out.print(d);}
                   System.out.println(i+10);
            }while(i<10);
        }
    }



