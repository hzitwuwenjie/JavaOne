package com.jc02.jiangzixu;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个四位数： ");
        int i = input.nextInt();
        Random rand = new Random();
        int j = (int) (Math.random() * 10);
        int k = i / 100 % 10;
        if(i<1000||i>9999) {
            System.out.println("您输入的数字有误");
            return;
        }
        else {
            System.out.println("您输入的数字为： "+i+"\n"+"随机生成的数字为： "+j);
            if (k == j) {
                System.out.println("恭喜您中奖");
            }
            else{
                System.out.println("谢谢参与");
            }
            }
        }
}
