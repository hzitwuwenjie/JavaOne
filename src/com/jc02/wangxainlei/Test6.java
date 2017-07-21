package com.jc02.wangxainlei;

import java.security.PublicKey;

public class Test6 {
   public static void main (String[] args){
       int i=0;
        for(i=0;i<=150;i++){
            System.out.print(i + "\t");
            if(i%3==0)
                System.out.print("foo\t");
            if(i%5==0)
                System.out.print("biz\t");
            if(i%7==0)
                System.out.print("baz\t");
            System.out.println("\t");


        }



   }

}

