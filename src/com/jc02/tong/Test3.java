package com.jc02.tong;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　     ***********
 * 　　　 　  　    \\　=_=　//
 * 　　　　　  　   (　 .@.@　)
 * +-------****-----( _ )-----****--------------------------------------------+
 * |　@author Tong　　　　　　                                                 |
 * |　@author 江西财经大学                                                     |
 * |　@create 2017年07月21日 - 9:26
 * |  @description   幸运转盘抽奖
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {

        Scanner j=new Scanner(System.in);
        System.out.println("输入用户号码");
        int i=j.nextInt();
        Random rand=new Random();
        int num=rand.nextInt(10);
        System.out.println("生成幸运数字:"+num);

            if (i/100%10==num)
                System.out.println("恭喜你成为幸运用户");
        else
                System.out.println("不好意思没中奖");
    }
}
