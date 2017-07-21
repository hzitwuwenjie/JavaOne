package com.jc02.zengjing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 9:22
 * |  @description   产生幸运数字
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("请输入一个四位数字");
        int a = i.nextInt();
        if (a<1000 || a>9999) {
            System.out.println("您输入的不是一个四位数，请输入1000~9999之间的数字");
            return;
        }else{
            System.out.println("您输入的数字是"+a);
            System.out.println("幸运数字是"+num);
            if (a/100%10==num ) {
                System.out.println("恭喜您中奖了");
            }else{
                System.out.println("蟹蟹 参与");
            }
            }
        }

    }
