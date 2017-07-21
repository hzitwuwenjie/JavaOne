package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要转换的十进制数");
        int number=input.nextInt();
        String s="";
        while (number!=0){

            s+=number%2;
            number=number/2;
        }
        for (int i=s.length()-1;i>=0;i-- ) {
            System.out.print(s.charAt(i));
        }
    }

}
