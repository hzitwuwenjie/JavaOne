package com.jc02.jiangzixu;

import java.util.Scanner;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test7 {
    public static void main(String[] args) {
        int zheng=0;
        int fu=0;
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("请输入整数，以0结束： ");
        do {
            number=input.nextInt();
            if (number>0){
                zheng++;
            }
            else if(number<0){
                fu++;
            }
        }
        while (number!=0);
        System.out.println("正数个数： "+zheng);
        System.out.println("负数个数： "+fu);
    }
}
