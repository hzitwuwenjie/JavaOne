package com.jc02.xieshikai;

import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 11:55
 * |  @description   从键盘读入个数不确定的整数，判断并统计正数和负数的个数，当输入为0时结束程序
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task7 {
    public static void main(String[] args) {
        int countpositive=0;
        int countnegative=0;
        int num=0;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入随机的整数：");
        do {
            num=input.nextInt();
            if(num>0)
                countpositive++;
            if(num<0)
                countnegative++;
            if(num==0)
                break;
        }while(num!=0);
        System.out.println("输入的正数个数为："+countpositive);
        System.out.println("输入的负数个数为："+countnegative);
    }
}
