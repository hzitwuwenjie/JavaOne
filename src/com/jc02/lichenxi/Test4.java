package com.jc02.lichenxi;


/**
 * Created by 李晨曦 2017年07月21日
 */
public class Test4 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++) {
            System.out.print(i);
            if(i%3==0){
                System.out.print("foo ");
            }
            if(i%5==0){
                System.out.print("biz ");
            }
            if(i%7==0){
                System.out.print("baz");
            }
            System.out.println("");
        }
    }
}
