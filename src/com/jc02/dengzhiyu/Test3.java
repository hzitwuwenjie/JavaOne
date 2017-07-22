package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 9:49　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {


    Scanner a=new Scanner(System.in);
    System.out.println("请输入一个四位整数");
    int b=a.nextInt();
    Random c = new Random();
    int d = c.nextInt(10);
    System.out.println("您输入的数字是："+b);
    System.out.println("随机数字是："+d);
    if(b<1000 && b>9999)
    {System.out.println("输入的数字不在范围内");

    }else{
        if(b/100%10==d)
            System.out.println("您中奖了！");
        else
            System.out.println("谢谢参与！");
    }


}
}

