package com.jc02.zoudongping;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 9:01
 * |    @description   抽奖
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand =new Random();
        System.out.println("请输入一个4位整数");
        int i=in.nextInt();
        int num = rand.nextInt(10);//调用Random类的对象的产生随机数的方法，并赋值给num。
        System.out.println("请输入号码：");
        if(i<1000||i>9999){
            System.out.println("重新输入");
            return;//代表方法停止运行，退出方法。
        }
        else {
            //判断用户输入数字的百威和随机数字相等
            if (i / 100 % 10 == num){
                System.out.println("恭喜中奖！\n" + "中奖号码：\t" + num + "您输入的号码：" + i);
            return;
            }
            else
                System.out.println("谢谢参与！\n"+"中奖号码：\t"+num+"您输入的号码："+i);
        }
    }
}
