package com.jc02.wangxainlei;
import java.util.Scanner;

public class Test11 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
    int a=0;
    int b=0;
    int c=0;
    double d=0;
        for(a=1;a<=10;a++){
            System.out.print(" 请输入第 " + a + "位顾客的年龄：");
            b=input.nextInt();
            //System.out.println(b);
            if (b>30) c++;
            //System.out.println(c);
        }
        d=c*10;
        System.out.println("30岁以下的比例为："+(100-d)+"%");
        System.out.println("30岁以上的比 例为："+d+"%");
    }
}


