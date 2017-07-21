package com.jc02.laicuinan;

/**
 * Created by Administrator on 2017/7/21.
 */
public class Lianxi4 {
    public static void main(String[] args) {
        for (int i=1;i<=150;i++){

            if (i%3==0){
                System.out.println(i + "\tfoo");
            }
            if (i%5==0){
                System.out.println(i + "\tbiz");
            }
            if (i%7==0){
                System.out.println(i + "\tbaz");
            }
            else System.out.println(i);
        }
    }
}
