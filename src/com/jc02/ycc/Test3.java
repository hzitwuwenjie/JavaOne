package com.jc02.ycc;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 9:01
 * |    @description   产生随机幸运用户
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random = new Random();

        int num=random.nextInt(10);// 调用 random函数，并赋值
        System.out.println("请输入一个4位整数 ：");
        int i=input.nextInt();//接受键盘输入的整数
        if(i<1000 || i>9999){
            System.out.println("输入的范围不正确！");
        }else {
            //判断用户输入的百位和随机数字相等
            System.out.println("您输入的数字是："+ i);
            System.out.println("随机数字 "+ num);
            if (i/100%10== num){
                System.out.println("恭喜你中奖了！");
            }else {
                System.out.println("谢谢参与");
            }
        }
    }
}
