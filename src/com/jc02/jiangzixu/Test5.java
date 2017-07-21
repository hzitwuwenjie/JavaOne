package com.jc02.jiangzixu;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test5 {
    public static void main(String[] args) {

        for (int i = 1; i <150 ; i++) {
            System.out.print(i+"\t");
            if (i%3==0){
                System.out.print("foo" + "\t");
            }
            if (i%5==0){
                System.out.print("biz"+"\t");
            }
            if (i%7==0){
                System.out.print("baz"+"\t");
            }
            System.out.println();
        }

    }
}
