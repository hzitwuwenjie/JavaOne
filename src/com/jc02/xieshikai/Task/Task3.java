package com.jc02.xieshikai.Task;

import java.util.Random;
import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                 -                                  　|
 * |　@adress 江西财经大学                                  -
 * |　@create 2017年07月21日 - 9:02                        -
 * |  @description   会员号的百位数=产生的随机数字，则为幸运儿 -
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的会员号：");
        int vipNum=input.nextInt();
        if(vipNum<1000||vipNum>9999) {
            System.out.println("会员号输入错误,请重试！");
            return;
        }
        else
            System.out.println("你的会员号为："+vipNum);
        Random rand=new Random();
        int randhundred=rand.nextInt(2);
        System.out.println("随机百位数为："+randhundred);
        if((vipNum/100%10)==randhundred)
            System.out.println("恭喜你中奖了！");
        else
            System.out.println("谢谢参与。");
    }
}
