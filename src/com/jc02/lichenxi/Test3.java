package com.jc02.lichenxi;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李晨曦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 9:22
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        Random  r = new Random();
        int num = r.nextInt(10);
        System.out.println("请输入一个四位整数：");
        int i = j.nextInt();
        if (i<1000||i>9999){
            System.out.println("请输入1000到9999之间的整数");
            return;
        }else{
            System.out.println("您输入的数字："+i);
            System.out.println("随机数字："+num);
            if(i/100%10 == num){
                System.out.println("恭喜中奖！");
            }else{
                System.out.println("谢谢参与！");
            }
        }
    }
}
