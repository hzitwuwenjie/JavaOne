package com.jc02.wangxainlei;

import java.util.Scanner;
public class Test8 {


    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int zhengshu=0;
        int fushu=0;
        int number=0;
        do{
            number=input.nextInt();
            if(number<0)
                fushu++;
            else  if(number>0)
                zhengshu++;
        }while (number!=0);
       System.out.println("输入正数的次数："+zhengshu);
        System.out.println("输入负数的次数："+fushu);






    }
}
