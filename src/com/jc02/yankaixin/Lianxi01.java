package com.jc02.yankaixin;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 9:04
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("请输入一个四位数:");
        int i = input.nextInt();
        if(i<1000 || i>9999){
            System.out.println("输入的范围不正确，请输入1000~9999之间的数字");
            return;
        }
        else{
            System.out.println("你输入的四位数是：" + i);
            System.out.println("随机数是：" + num);
            if(i/100%10==num)
                System.out.println("恭喜你，中奖了！");
            else
                System.out.println("谢谢参与！");
        }

    }
}
