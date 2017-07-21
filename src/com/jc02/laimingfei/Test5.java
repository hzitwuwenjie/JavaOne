package com.jc02.laimingfei;

/**
 * Created by ${赖明飞} .
 */
public class Test5 {
    public static void main(String[] args) {
        for(int i=1; i<=150;i++){
            System.out.print(i);
            if(i%3==0)
                System.out.print("foo");
           if(i%5==0)
                System.out.print("biz");
            if(i%7==0)
                System.out.print("baz");
            System.out.println("");
        }
    }
}
