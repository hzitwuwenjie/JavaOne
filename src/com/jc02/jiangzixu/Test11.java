package com.jc02.jiangzixu;

import java.util.Scanner;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个十进制整数");
        int num=input.nextInt();
        String bt = "" ;
        while (num!=0){
            bt+=num%2;
            num=num/2;
        }
        for (int i=bt.length()-1 ; i>=0;i--) {
            System.out.print(bt.charAt(i));
        }

    }
}
